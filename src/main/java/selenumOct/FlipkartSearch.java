package selenumOct;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.protobuf.Duration;

public class FlipkartSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("tshirt");
		Thread.sleep(4000);

		List<WebElement> suggList = driver.findElements(By.xpath("//a[@class='oleBil']/div[2]"));
		System.out.println(suggList.size());

		for (int i = 0; i < suggList.size(); i++) {
			String text = suggList.get(i).getText();
			System.out.println(text);
			if (text.contains("tshirt for women")) {
				suggList.get(i).click();
				break;
			}
		}
		driver.quit();
	}
}
