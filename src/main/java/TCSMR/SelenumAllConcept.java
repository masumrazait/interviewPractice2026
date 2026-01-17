package TCSMR;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelenumAllConcept {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new"); // Recommended
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
		Thread.sleep(1000);
		List<WebElement> colors = driver.findElements(By.xpath("//select[@id='colors']/option"));
		System.out.println(colors.size());
		for (WebElement color : colors) {
			if (color.getText().equals("Green")) {
				color.click();
				System.out.println(color.getText());
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		// Sorted List
		List<WebElement> animals = driver.findElements(By.xpath("//select[@id='animals']/option"));
		System.out.println(animals.size());
		for (WebElement animal : animals) {
			if (animal.getText().equals("Green")) {
				animal.click();
			}
			System.out.println(animal.getText());
		}
		WebDriverWait wait = new WebDriverWait(driver, 59);
		// Scroll to date picker
		WebElement dateInput = driver.findElement(By.id("datepicker"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateInput);
		dateInput.click();
		String targetMonth = "December";
		String targetYear = "2029";
		String targetDay = "25";
		while (true) {
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			if (month.equals(targetMonth) && year.equals(targetYear)) {
				break;
			}
			// Click Next button
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		// Select day
		driver.findElement(By.xpath("//a[text()='" + targetDay + "']")).click();
		System.out.println("Selected Date: " + dateInput.getAttribute("value"));
		WebElement ele = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.quit();
	}
}
