package januarySelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javascriptjs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String password = "admin";
		String url = "https://" + user + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> i1 = allWindow.iterator();
		while (i1.hasNext()) {
			String childWindow = i1.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				WebElement menu = driver.findElement(By.xpath("//button[text()='Categories']"));
				Actions action = new Actions(driver);
				action.moveToElement(menu).perform();
				driver.findElement(By.xpath("//a[text()='tools']")).click();
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}

}
