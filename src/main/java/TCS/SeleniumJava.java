package TCS;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions opp = new ChromeOptions();
		opp.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(opp);
		WebDriver driver = new ChromeDriver();
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
		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('name').value='masum';");

		Actions action = new Actions(driver);
		List<WebElement> days = driver.findElements(By.xpath("//label[@for=\"days\"]/following-sibling::div/label"));
		System.out.println(days.size());
		for (WebElement day : days) {
			String week = day.getAttribute("for");
			System.out.println(week);
			action.moveToElement(day);
			Thread.sleep(300);
			if (day.getText().equalsIgnoreCase("saturday")) {
				day.click();
				System.out.println(week);
			}
		}

		driver.findElement(By.id("promptBtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("masum");
		alert.accept();

		// popup window
		driver.findElement(By.id("PopUp")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				System.out.println("Child window title: " + driver.getTitle());
				driver.close(); // closes child window
			}
		}
//		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title: " + driver.getTitle());
		driver.quit();
	}
}
