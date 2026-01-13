package Coforge;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String username = "admin";
		String password = "admin";
		String urls = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(urls);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.get("https://masumrazait.netlify.app/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				int responseCode = connection.getResponseCode();
				if (responseCode >= 400) {
					System.out.println("broken links: " + url + " -----> " + responseCode);
				} else {
					System.out.println("valid links: " + url + " -----> " + responseCode);
				}
			} catch (Exception e) {
				System.out.println("Exception for URL: " + url);
			}
		}

		driver.quit();
	}
}
