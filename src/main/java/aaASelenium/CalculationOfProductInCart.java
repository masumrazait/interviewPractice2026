package aaASelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalculationOfProductInCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> AddToCarts = driver.findElements(By.xpath("//div[@class=\"product-action\"]/button"));
		System.out.println("Total Product availbe in page: " + AddToCarts.size());
		Actions action = new Actions(driver);
		for (WebElement AddToCart : AddToCarts) {
			action.moveToElement(AddToCart).perform();
			Thread.sleep(500);
			AddToCart.click();
		}
		WebElement cart = driver.findElement(By.xpath("//a[@class=\"cart-icon\"]/img"));
		cart.click();
		List<WebElement> prices = driver
				.findElements(By.xpath("//div[@class=\"cart-preview active\"]//p[@class=\"amount\"]"));
		int total = 0;
		System.out.println("totla price row is: " + prices.size());
		for (WebElement price : prices) {
			action.moveToElement(price).perform();
			int productPrice = Integer.parseInt(price.getText());
			total += productPrice;
			System.out.println("product price: " + price.getText() + "" + "as of now: " + total);

		}

		driver.quit();
	}
}
