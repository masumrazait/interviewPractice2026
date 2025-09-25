package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user = "admin";
		String password = "admin";
		String url = "https://" + user + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		driver.findElement(By.xpath("//a[@href=\"http://elementalselenium.com/\"]")).click();
		String parent = driver.getWindowHandle();
		Set<String> Allwindow = driver.getWindowHandles();
		Iterator<String> Il = Allwindow.iterator();
		while (Il.hasNext()) {
			String childWindow = Il.next();
			if (!parent.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Child window title: " + driver.getTitle());
			}
		}
		driver.quit();
	}
}
