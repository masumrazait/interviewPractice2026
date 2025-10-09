package SeleniumOctober;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertS {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// First concept
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File("./screenshot/image1.png"));
		Thread.sleep(3000);
		// Second concept
		WebElement AlertsBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		AlertsBtn.click();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(3000);
		AlertsBtn.click();
		alert.accept();
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/image.png"));
		// Third concept
		WebElement AlertsBtn1 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		AlertsBtn1.click();
		Thread.sleep(3000);
		alert.sendKeys("masum");
		alert.accept();
		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot3, new File("./screenshot/image3.png"));

		System.out.println(driver.getTitle());
		driver.quit();
	}
}
