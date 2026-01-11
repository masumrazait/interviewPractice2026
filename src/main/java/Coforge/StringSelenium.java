package Coforge;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StringSelenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String pass = "admin";
		String url = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> li = aw.iterator();
		while (li.hasNext()) {
			String cw = li.next();
			if (!pw.equals(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.get("https://practice.expandtesting.com/dropdown");
		System.out.println(driver.getTitle());
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown = new Select(country);
		List<WebElement> getOptions = dropdown.getOptions();
		for (WebElement getOption : getOptions) {
			String countryName = getOption.getText();
			System.out.println(countryName);
			if (countryName.equals("India")) {
				dropdown.selectByVisibleText("India");
				System.out.println("Selected: " + countryName);
			}
		}
		driver.quit();
	}
}
