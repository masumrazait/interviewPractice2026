package AAMphasis2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> countries = driver.findElements(By.xpath("//select[@id='country']//option"));
		System.out.println(countries.size());
		for (WebElement getCountry : countries) {
			if (getCountry.getText().equals("France")) {
				getCountry.click();
			}
		}
		Thread.sleep(3000);
		// Locate Slider Handles
		WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		// Create Actions class
		Actions act = new Actions(driver);
		// Move Min Slider to Right
		act.dragAndDropBy(minSlider, 0, 0).perform();
		Thread.sleep(2000);
		// Move Max Slider to Left
		act.dragAndDropBy(maxSlider, 300, 0).perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		
		// Get total number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		// Get total number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
		System.out.println("Total Rows: " + rows.size());
		System.out.println("Total Columns: " + cols.size());
		System.out.println("====================================================================");
		// Print Header
		for (WebElement col : cols) {
			System.out.print(col.getText() + "  |  ");
		}
		System.out.println();
		System.out.println("====================================================================");

		// Print Table Data
		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= cols.size(); j++) {
				String data = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data + "  |  ");
			}
			System.out.println();
			System.out.println("====================================================================");

		}
		driver.quit();
	}
}
