package Coforge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 50);
		driver.get("https://www.wikipedia.org/");
		wait.until(ExpectedConditions.titleContains("Wikipedia"));
		WebElement dropdownElement = driver.findElement(By.id("searchLanguage"));
		Select dropdown = new Select(dropdownElement);
		// 🔹 Print all options in the dropdown
		List<WebElement> allOptions = dropdown.getOptions();
		System.out.println("All Dropdown Options:");
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		// 🔹 Verify if a specific option exists
		String valueToSelect = "English";
		boolean found = false;
		for (WebElement option : allOptions) {
			if (option.getText().equalsIgnoreCase(valueToSelect)) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(valueToSelect + " is present in dropdown");
			// 🔹 Select the option by visible text
			dropdown.selectByVisibleText(valueToSelect);
		} else {
			System.out.println(valueToSelect + " is NOT present in dropdown");
		}
		driver.quit();
	}
}
