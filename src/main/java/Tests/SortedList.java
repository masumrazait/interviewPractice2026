package Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortedList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> animalList = driver.findElements(By.xpath("//select[@id='animals']/option"));
		for (WebElement animal : animalList) {
			String value = animal.getAttribute("value");
			System.out.println(value);
			if (value.equalsIgnoreCase("cat")) {
				animal.click();
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
