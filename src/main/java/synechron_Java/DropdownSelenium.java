package synechron_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> country = driver.findElements(By.xpath("//select[@id='country']/option"));
		System.out.println(country.size());
		for (WebElement options : country) {
			if (options.getText().equalsIgnoreCase("China")) {
				options.click();
				System.out.println(options.getText());
			}
		}
		driver.quit();
	}
}
