package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		ScreenshotListener.driver = driver;
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
