package Coforge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// 🔹 Navigate to website
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); // example site

		// 🔹 Locate dropdown element
		WebElement dropdownElement = driver.findElement(By.id("select-demo"));

		// 🔹 Wrap it with Select class
		Select dropdown = new Select(dropdownElement);

		// 🔹 Print all options in the dropdown
		List<WebElement> allOptions = dropdown.getOptions();
		System.out.println("All Dropdown Options:");
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}

		// 🔹 Verify if a specific option exists
		String valueToSelect = "Wednesday";
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

		// 🔹 Close browser
		driver.quit();
	}
}
