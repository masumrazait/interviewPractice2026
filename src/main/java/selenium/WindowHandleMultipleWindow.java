package selenium;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.hc.core5.http.io.HttpServerConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleMultipleWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> AllWindow = driver.getWindowHandles();
		Iterator<String> Il = AllWindow.iterator();
		while (Il.hasNext()) {
			String childWindow = Il.next();
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				List<WebElement> list = driver.findElements(By.tagName("a"));
				System.out.println(list.size());
				for (WebElement link : list) {
					String url = link.getAttribute("href");
					System.out.println(url);
					if (url == null || url.isEmpty() || url.startsWith("http")) {
						System.out.println("skipp invalid link: " + url);
						continue;
					}
					try {
						HttpsURLConnection connect = (HttpsURLConnection) new URL(url).openConnection();
						connect.setRequestMethod("HEAD");
						connect.connect();
						int resposeCode = connect.getResponseCode();
						if (resposeCode >= 400) {
							System.out.println(url + " is a broken link.");
						} else {
							System.out.println(url + " is a valid links.");
						}
					} catch (Exception e) {
						System.out.println("Error checing links: " + url + " -> " + e.getMessage());
					}
				}

				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("after returen main window: " + driver.getTitle());
		driver.quit();
	}
}
