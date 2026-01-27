package AccentureJan;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 1️⃣ Open application
		driver.get("https://interviewlikeapro.blogspot.com/2026/01/complete-rest-assured-interview.html"); // change URL

		// 2️⃣ Get all anchor tags
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + links.size());

		// 3️⃣ Loop through each link
		for (WebElement link : links) {

			String url = link.getAttribute("href");

			// Skip empty or javascript links
			if (url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}

			try {
				// 4️⃣ Create HTTP connection
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

				connection.setConnectTimeout(5000);
				connection.connect();

				// 5️⃣ Get response code
				int responseCode = connection.getResponseCode();

				if (responseCode >= 400) {
					System.out.println("❌ Broken Link: " + url + " --> " + responseCode);
				} else {
					System.out.println("✅ Valid Link: " + url + " --> " + responseCode);
				}

			} catch (Exception e) {
				System.out.println("⚠️ Exception for URL: " + url);
			}
		}

		// 6️⃣ Close browser
		driver.quit();
	}
}
