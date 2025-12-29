package januarySelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://masumrazait.netlify.app/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> l1 = allWindow.iterator();
		while (l1.hasNext()) {
			String childWindow = l1.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		driver.quit();
	}

}
