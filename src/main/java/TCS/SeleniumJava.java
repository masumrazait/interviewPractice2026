package TCS;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumJava {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions opp = new ChromeOptions();
		opp.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://interviewlikeapro.blogspot.com/2026/01/complete-rest-assured-interview.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}
			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setConnectTimeout(5);

				conn.connect();
				int responseCode = conn.getResponseCode();
				if (responseCode >= 400) {
					System.out.println("Broken link: " + url + " ---> " + responseCode);
				} else {

					System.out.println("Valid link: " + url + " ---> " + responseCode);
				}

			} catch (Exception e) {
				System.out.println("Exception for URL: " + url);
			}
		}
		System.out.println(driver.getTitle());
		String username = "admin";
		String password = "admin";
		String urlapp = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(urlapp);
		System.out.println(driver.getTitle());

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();

		driver.quit();
	}
}
