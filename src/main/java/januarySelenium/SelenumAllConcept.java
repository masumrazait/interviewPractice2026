package januarySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelenumAllConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Locate the email input using stable XPath (label text)
		WebElement emailField = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//label[text()='User Email']/following-sibling::input")));
		emailField.sendKeys("test@example.com");
		System.out.println("Email entered successfully");

		WebElement passwordField = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//label[text()='Password']/following-sibling::input")));
		passwordField.sendKeys("test@example.com");
		System.out.println("Password entered successfully");

		WebElement CompanyField = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//label[text()='Company']/following::input[@name='company'][1]")));
		CompanyField.sendKeys("CompanyField");
		System.out.println("Company entered successfully");

		driver.get("https://masumrazait.netlify.app/");
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('name')[0].value='Masum';");
		Thread.sleep(3000);
//		js.executeScript("document.getElementById('name').value='Masum';");

		driver.quit();
	}

}
