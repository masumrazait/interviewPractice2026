package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
			String child = Il.next();
			if (!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				List<WebElement> link = driver.findElements(By.tagName("a"));
				System.out.println(link.size());
				for (WebElement links : link) {
					String href = links.getAttribute("href");
					System.out.println(href);
				}
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}
}
