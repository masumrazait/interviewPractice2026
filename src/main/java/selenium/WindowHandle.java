package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open a demo page
		driver.get("https://the-internet.herokuapp.com/windows");

		// Click the link to open a new window
		WebElement clickHere = driver.findElement(By.linkText("Click Here"));
		clickHere.click();

		// Get the parent window handle
		String parentWindow = driver.getWindowHandle();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Iterate over windows
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String childWindow = it.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				// Switch to child window
				driver.switchTo().window(childWindow);
				System.out.println("Child window title: " + driver.getTitle());

				// Perform any action in child window
				Thread.sleep(2000);

				// Close child window
				driver.close();
			}
		}

		// Switch back to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title: " + driver.getTitle());

		// Close parent
		driver.quit();
	}
}
