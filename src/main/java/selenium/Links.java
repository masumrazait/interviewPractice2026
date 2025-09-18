package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://uttamcoaching.netlify.app/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Link present in webpage: " + links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			String text = link.getText();

			System.out.println("Text above link: " + text);
			System.out.println("Website link: " + url);

			// skip null, empty, and non-http links
			if (url == null || url.isEmpty() || !url.startsWith("http")) {
				System.out.println("Skipping invalid link: " + url);
				continue;
			}

			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				int responseCode = connection.getResponseCode();

				if (responseCode >= 400) {
					System.out.println(url + " is a broken link.");
				} else {
					System.out.println(url + " is a valid link.");
				}
			} catch (Exception e) {
				System.out.println("Error checking link: " + url + " -> " + e.getMessage());
			}
		}

		driver.quit();
	}
}
