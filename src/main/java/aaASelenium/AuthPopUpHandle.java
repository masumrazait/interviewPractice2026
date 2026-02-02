package aaASelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthPopUpHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		String username = "admin";
		String password = "admin";
		String app = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(app);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
