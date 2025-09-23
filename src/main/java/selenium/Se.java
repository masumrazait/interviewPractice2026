package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Se {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String password = "admin";
		String url = "https://" + user + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		driver.findElement(By.xpath("//div[@id=\"page-footer\"]//a[text()='Elemental Selenium']")).click();
		// System.out.println("page title is: " + driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleContains("The Internet"));
		Thread.sleep(4000);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (WebElement links : link) {
			String href = links.getAttribute("href");
			String text = links.getText();
			System.out.println("Text is presrent on webpage is : " + text);
			System.out.println("Href is presrent on webpage is : " + href);
		}
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("./image/selenium.png"));
		String parentwindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> li = allWindows.iterator();
		while (li.hasNext()) {
			String childWindow = li.next();
			if (!parentwindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']"));
				Thread.sleep(4000);
				driver.close();
			}
		}

		driver.quit();
	}

}
