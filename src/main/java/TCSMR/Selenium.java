package TCSMR;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/#");
		WebElement confirmBtn = driver.findElement(By.id("confirmBtn"));
		confirmBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		WebElement promptBtn = driver.findElement(By.id("promptBtn"));
		promptBtn.click();
		alert.sendKeys("promptBtn");
		alert.accept();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.id("PopUp")).click();
		String pw = driver.getWindowHandle();
		Set<String> al = driver.getWindowHandles();
		Iterator<String> il = al.iterator();
		while (il.hasNext()) {
			String cw = il.next();
			if (!pw.equalsIgnoreCase(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for (WebElement link : links) {
					String url = link.getAttribute("href");
					if (url == null || url.isEmpty()) {
						System.err.println("Url is null or Empty");
						continue;
					}
					try {
						URL linkURL = new URL(url);
						HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();
						con.connect();
						int responseCode = con.getResponseCode();
						if (responseCode >= 400) {
							System.out.println(url + " ---> Broken link (" + responseCode + ")");
						} else {
							System.out.println(url + " ---> Valid link (" + responseCode + ")");

						}
					} catch (Exception e) {
						System.out.println(url + " ---> Exception occurred");
					}
				}
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
