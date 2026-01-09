package SeleniumNov;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String pswd = "admin";
		String url = "https://" + user + ":" + pswd + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		Thread.sleep(3000);
		System.out.println(driver.getTitle() + "  \n" + driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> il = aw.iterator();
		while (il.hasNext()) {
			String cp = il.next();
			if (!pw.equals(cp)) {
				driver.switchTo().window(cp);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();
	}
}
