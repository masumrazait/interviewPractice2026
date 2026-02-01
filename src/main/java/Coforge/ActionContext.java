package Coforge;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);
		
		act.contextClick(driver.findElement(By.cssSelector("span.context-menu-one"))).perform();
		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list > li >span"));
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.contains("Copy")) {
					e.click();
					break;
				}
		}
driver.quit();
	}

}
