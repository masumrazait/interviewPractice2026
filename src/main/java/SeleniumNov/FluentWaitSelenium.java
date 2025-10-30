package SeleniumNov;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitSelenium {
	 public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

	        driver.findElement(By.xpath("//button[text()='Start']")).click();

	        // 🔹 Create FluentWait (Selenium 3 way)
	        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(30, TimeUnit.SECONDS)        // Maximum wait time
	                .pollingEvery(2, TimeUnit.SECONDS)        // Check every 2 seconds
	                .ignoring(NoSuchElementException.class);  // Ignore NoSuchElementException

	        // 🔹 Wait until element is visible
	        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                WebElement ele = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	                if (ele.isDisplayed()) {
	                    System.out.println("Element is now visible!");
	                    return ele;
	                } else {
	                    System.out.println("Waiting for element...");
	                    return null;
	                }
	            }
	        });

	        System.out.println("Text Found: " + element.getText());
	        driver.quit();
	    }
}
