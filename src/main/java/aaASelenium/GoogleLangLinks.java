package aaASelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleLangLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElements(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}
			try {
				HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
				con.setConnectTimeout(50);
				con.connect();
				int responseCode = con.getResponseCode();
				if (responseCode >= 400) {
					System.out.println("❌ Broken Link: " + url + " --> " + responseCode);
				} else {
					System.out.println("✅ Valid Link: " + url + " --> " + responseCode);
				}

			} catch (Exception e) {
				System.out.println("⚠️ Exception for URL: " + url);
			}
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
