package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSecondLastDropdown {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Open Demo Website
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		// Locate Dropdown element
		WebElement dropdownElement = driver.findElement(By.tagName("select"));
		Select dropdown = new Select(dropdownElement);

		// Get all options
		List<WebElement> allOptions = dropdown.getOptions();
		int total = allOptions.size();

		System.out.println("Total dropdown options: " + total);

		if (total >= 10) {
			// Select 2nd last option
			int secondLastIndex = total - 10;
			WebElement secondLastOption = allOptions.get(secondLastIndex);
			dropdown.selectByIndex(secondLastIndex);
			Thread.sleep(5000);

			System.out.println("Selected Option: " + secondLastOption.getText());
		} else {
			System.out.println("Dropdown does not have enough options!");
		}

		driver.quit();
	}
}
