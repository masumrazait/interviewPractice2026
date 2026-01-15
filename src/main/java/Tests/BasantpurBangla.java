package Tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasantpurBangla {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String username = "admin";
		String password = "admin";
		String urls = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(urls);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> li = aw.iterator();
		while (li.hasNext()) {
			String cw = li.next();
			if (!pw.equals(cw)) {
				driver.switchTo().window(cw);
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for (WebElement link : links) {
					String url = link.getAttribute("href");
					System.out.println(url);
				}

				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();
	}
}
