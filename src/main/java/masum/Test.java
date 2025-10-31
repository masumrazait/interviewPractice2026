package masum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		WebElement src=driver.findElement(By.xpath("(//div[@class=\"single-products\"])[1]"));
		Actions action =new Actions(driver);
		action.moveToElement(src).perform();
		driver.findElement(By.xpath("(//div[@class=\"product-overlay\"]//a[text()='Add to cart'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Automation Exercise"));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
