package TCSMR;

import java.util.Iterator;
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
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
