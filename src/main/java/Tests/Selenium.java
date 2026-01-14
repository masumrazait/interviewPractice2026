package Tests;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Masum Raza");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Masum@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9883732751");
		driver.findElement(By.id("textarea")).sendKeys("Basantpur Bangle Amnour Saran Bihar");
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		driver.findElement(By.id("sunday")).click();
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText("China");
		Thread.sleep(3000);
		WebElement colors = driver.findElement(By.id("colors"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", colors);
		// Select Yellow using JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("for(let option of arguments[0].options){ "
				+ "if(option.text === 'Yellow'){ option.selected = true; } }", colors);
		
		WebElement src = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement trg = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(src, trg).build().perform();
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("./IMAGEFOlder/test.png"));
		Thread.sleep(3000);
		driver.quit();
	}
}