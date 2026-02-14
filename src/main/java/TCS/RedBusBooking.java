package TCS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebDriverWait wait = new WebDriverWait(driver, 40);

		// -------- FROM CITY --------
		WebElement fromCity = wait.until(ExpectedConditions.elementToBeClickable(By.id("src")));
		fromCity.sendKeys("Bangalore");
		Thread.sleep(1000);
		fromCity.sendKeys(Keys.ENTER);

		// -------- TO CITY --------
		WebElement toCity = driver.findElement(By.id("dest"));
		toCity.sendKeys("Chennai");
		Thread.sleep(1000);
		toCity.sendKeys(Keys.ENTER);

		// -------- SELECT DATE --------
		driver.findElement(By.id("onwardCal")).click();

		// Select specific date (example: 25th)
		WebElement date = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='wd day' and text()='25']")));
		date.click();

		// -------- SEARCH BUSES --------
		driver.findElement(By.id("search_button")).click();
		driver.quit(); 
	}
}
