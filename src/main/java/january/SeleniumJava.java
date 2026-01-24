package january;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		// WebDriver driver = new ChromeDriver(option);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://springstubbe.us/projects/jquery-multiselect/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id=\"ms-list-1\"]")).click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"ms-options\"]//label"));
		System.out.println(options.size());
		for (WebElement getOptions : options) {
			System.out.println(getOptions.getText());
			if (getOptions.getText().equals("California")) {
				getOptions.click();
				System.out.println(getOptions);
			}
			Thread.sleep(300);
		}

		Thread.sleep(3000);
		driver.quit();

	}
}
