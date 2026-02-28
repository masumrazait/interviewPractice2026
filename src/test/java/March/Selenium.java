package March;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String pswd = "admin";
		String url = "https://" + user + ":" + pswd + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> il = aw.iterator();
		while (il.hasNext()) {
			String cw = il.next();
			if (!pw.equals(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				System.out.println(driver.getTitle());
				List<WebElement> HeaderTitle = driver.findElements(By.xpath("//div[@class=\"card__header\"]//a"));
				System.out.println(HeaderTitle.size());
				for (WebElement getHeader : HeaderTitle) {
					Actions action = new Actions(driver);
					action.moveToElement(getHeader).perform();
					System.out.println(getHeader.getText());

				}
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();
	}
}
