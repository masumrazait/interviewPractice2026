package TCSMR;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenumAllConcept {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String user = "admin";
		String pass = "admin";
		String appurl = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(appurl);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("masumraza");
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("./Images/image.png"));
		driver.findElement(By.id("name")).sendKeys("masumraza");
		driver.findElement(By.id("email")).sendKeys("masumraza@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9874563210");
		driver.findElement(By.id("textarea")).sendKeys("Automated this page working fine");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("saturday")).click();
		Thread.sleep(1000);
		List<WebElement> country = driver.findElements(By.xpath("//select[@id='country']/option"));
		System.out.println(country.size());
		for (WebElement Options : country) {
			if (Options.getText().equals("India")) {
				Options.click();
				System.out.println(Options.getText());
			}
		}
		Thread.sleep(3000);

		driver.quit();
	}
}
