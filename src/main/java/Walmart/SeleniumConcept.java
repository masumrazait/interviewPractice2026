package Walmart;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String pass = "admin";
		String appUrl = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(appUrl);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		System.out.println(driver.getTitle());
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> it = aw.iterator();
		while (it.hasNext()) {
			String cw = it.next();
			if (!pw.equalsIgnoreCase(cw)) {
				System.out.println(driver.getTitle());
				driver.switchTo().window(cw);
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for (WebElement link : links) {
					String href = link.getAttribute("href");
					System.out.println(href);
				}
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();
	}
}
