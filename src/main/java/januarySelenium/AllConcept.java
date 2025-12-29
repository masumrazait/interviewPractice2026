package januarySelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllConcept {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://masumrazait.netlify.app/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./Images/image1.png"));
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
				File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(img, new File("./Images/image2.png"));
				Thread.sleep(3000);
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		String userName = "admin";
		String password = "admin";
		String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pWindow = driver.getWindowHandle();
		Set<String> aWindow = driver.getWindowHandles();
		Iterator<String> I1 = aWindow.iterator();
		while (I1.hasNext()) {
			String cWindow = I1.next();
			if (!pWindow.equalsIgnoreCase(cWindow)) {
				driver.switchTo().window(cWindow);
				File sShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sShot, new File("./Images/image3.png"));
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(pWindow);
		}
		driver.quit();
	}

}
