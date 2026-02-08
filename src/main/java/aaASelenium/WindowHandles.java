package aaASelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		op.addArguments("--headless");
		// WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> il = aw.iterator();
		while (il.hasNext()) {
			String cw = il.next();
			if (!pw.equals(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("Total link on webpage: " + links.size());
				for (WebElement link : links) {
					String href = link.getAttribute("href");
					System.out.println(href);
				}
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();
	}
}
