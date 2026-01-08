package januarySeleniumWipro;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCoreConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String username = "admin";
		String password = "admin";
		String url = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String PW = driver.getWindowHandle();
		Set<String> allW = driver.getWindowHandles();
		Iterator<String> li = allW.iterator();
		while (li.hasNext()) {
			String child = li.next();
			if (!PW.equals(child)) {
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				System.out.println(driver.getTitle());
				driver.switchTo().window(child);
				driver.close();
			}
		}
		driver.switchTo().window(PW);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
