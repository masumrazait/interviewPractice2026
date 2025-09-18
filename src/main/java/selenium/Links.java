package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.apple.com/in/store");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total Link present in webpage: " + link.size());
		for (WebElement links : link) {
			String href = links.getAttribute("href");
			String text = links.getText();
			System.out.println("Test above link: " + text);
			System.out.println("website links: " + href);
		}
		driver.quit();

	}

}
