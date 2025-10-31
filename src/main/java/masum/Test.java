package masum;

import java.util.List;

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
		WebElement src = driver.findElement(By.xpath("(//div[@class=\"single-products\"])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(src).perform();
		driver.findElement(By.xpath("(//div[@class=\"product-overlay\"]//a[text()='Add to cart'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Automation Exercise"));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.get("https://money.rediff.com/losers");
		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'dataTable')].//thead/tr/th"));
		
		// Get all header columns
		List<WebElement> headers = table.findElements(By.xpath(".//thead/tr/th"));
		System.out.println("==== TABLE HEADERS ====");
		for (WebElement header : headers) {
			System.out.print(header.getText() + "  |  ");
		}
		System.out.println("\n=========================");

		// Get all rows in table body
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

		System.out.println("==== TABLE DATA ====");
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.print(col.getText() + "  |  ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
