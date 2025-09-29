package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String child = it.next();
			if (!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child Window Title: " + driver.getTitle());
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("Total Links: " + links.size());
				for (WebElement l : links) {
					System.out.println(l.getAttribute("href"));
				}
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}
}