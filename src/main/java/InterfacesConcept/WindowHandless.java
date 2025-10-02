package InterfacesConcept;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandless {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> il = allWindow.iterator();
		while (il.hasNext()) {
			String child = il.next();
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(5000);
			}
		}
		driver.switchTo().window(parent);
		driver.quit();
	}
}
