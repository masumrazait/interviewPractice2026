package Tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://masumrazait.netlify.app/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty or null");
				continue;
			}
			try {
				URL linkURL = new URL(url);
				HttpURLConnection httpConn = (HttpURLConnection) linkURL.openConnection();
				httpConn.connect();
				int responseCode = httpConn.getResponseCode();
				if (responseCode >= 400) {
					System.out.println(url + " ---> Broken link (" + responseCode + ")");
				} else {
					System.out.println(url + " ---> Valid link (" + responseCode + ")");
				}
			} catch (Exception e) {
				System.out.println(url + " ---> Exception occurred");
			}
		}
		driver.quit();
	}
}
