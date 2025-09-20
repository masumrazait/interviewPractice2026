package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");

		List<WebElement> bars = driver.findElements(By.xpath(
				"//*[local-name()='svg']//*[local-name()='g' and @class='highcharts-series-group']//*[name()='rect']"));

		System.out.println("Number of bars: " + bars.size());
		Actions act = new Actions(driver);
		for (WebElement e : bars) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String text=driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='g' and @class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()=\"text\"]")).getText();
			System.out.println(text);
		}
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.quit();
	}

}
