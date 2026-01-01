package januarySelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveAndCheckLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://masumrazait.netlify.app/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + links.size());
		for (int i = 0; i < links.size(); i++) {
			// Re-locate elements to avoid stale element exception
			links = driver.findElements(By.tagName("a"));
			String url = links.get(i).getAttribute("href");

			if (url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}

			try {
				// Check link status
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				int responseCode = connection.getResponseCode();
				if (responseCode >= 400) {
					System.out.println("❌ Broken Link: " + url);
				} else {
					System.out.println("✅ Valid Link: " + url);

					// Navigate to link
					driver.get(url);
					System.out.println("Visited Page Title: " + driver.getTitle());
					Thread.sleep(500);
					// Navigate back
					driver.navigate().back();
				}
			} catch (Exception e) {
				System.out.println("⚠️ Error while checking link: " + url);
			}
		}
		driver.quit();
	}
}
