package aaASelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthPopUpHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String pass = "admin";
		String appUrl = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(appUrl);
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			System.out.println(url);
		}

		System.out.println(driver.getTitle());
		driver.quit();
	}
}
