package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath(
				"(//div[@class=\"products-wrapper\"]//div[@class=\"product\"]//div[@class=\"product-action\"])[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"cart\"]//a[@class=\"cart-icon\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(3000);
		String crUrl = driver.getCurrentUrl();
		String NewUrl = "https://rahulshettyacademy.com/seleniumPractise/#/cart";

		System.out.println(crUrl);
		System.out.println(NewUrl);
		if (crUrl.equals(NewUrl)) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");
		}
		System.err.println(driver.getTitle());
		driver.quit();
	}
}
