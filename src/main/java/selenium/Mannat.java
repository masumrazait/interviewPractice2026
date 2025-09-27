package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mannat {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://masumrazait.github.io/mmbi/index.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href=\"pages/register.html\" and text()='New user? Register']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("regName")).sendKeys("Raza");
		driver.findElement(By.id("regEmail")).sendKeys("raza@gmail.com");
		driver.findElement(By.id("regMobile")).sendKeys("9876543210");
		driver.findElement(By.id("regPass")).sendKeys("raza@gmail.com");
		WebElement accountType = driver.findElement(By.id("regAcctType"));
		Select dropdown = new Select(accountType);
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id=\"regInit\"]")).sendKeys("9800000");
		WebElement upload = driver.findElement(By.id("regKyc"));
		((JavascriptExecutor) driver)
		    .executeScript("arguments[0].style.display='block'; arguments[0].style.visibility='visible';", upload);
		upload.sendKeys("D:\\My_Project\\Website_Design\\MannatBank_UI\\pages\\register.html");

		Thread.sleep(3000);
		File pic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("./Images/register.png"));
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 59);
		wait.until(ExpectedConditions.titleContains("Dashboard - Mannat Bank"));
		String welcomeMsg = driver.findElement(By.xpath("//h4[text()='Welcome back, Raza']")).getText();
		String message = "Welcome back, Raza";
		if (welcomeMsg.equals(message)) {
			System.out.println("Test is passed.");
		} else {
			System.out.println("Test is fail.");
		}
		Thread.sleep(3000);
		File pic1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic1, new File("./Images/dashboard.png"));
		

		driver.quit();

	}
}
