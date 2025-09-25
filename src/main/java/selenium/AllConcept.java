package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				List<WebElement> link = driver.findElements(By.tagName("a"));
				System.out.println(link.size());
				for (WebElement links : link) {
					String href = links.getAttribute("href");
					System.out.println(href);
				}
				WebElement element = driver.findElement(By.xpath("//button[text()='Categories']"));
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
				driver.findElement(By.xpath("//a[text()='tools']")).click();
				List<WebElement> tools = driver.findElements(By.xpath("//small[text()='TOOLS']"));
				System.out.println(tools.size());
				for (WebElement listOfTools : tools) {
					action.moveToElement(listOfTools).perform();
				}

			}
		}

		driver.quit();
	}
}
