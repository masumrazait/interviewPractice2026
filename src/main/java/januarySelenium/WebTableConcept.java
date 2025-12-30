package januarySelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	    driver = new ChromeDriver(); // ✅ initialize static driver
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.get("https://selectorshub.com/xpath-practice-page/");
	    Thread.sleep(4000);

	    selectUser("Joe.Root");
	    selectUser("John.Smith");

	    List<String> joeInfo = getUserInfoList("Joe.Root");
	    System.out.println(joeInfo);

	    List<String> johnInfo = getUserInfoList("John.Smith");
	    System.out.println(johnInfo);
	}


	public static List<String> getUserInfoList(String username) {
		List<WebElement> userInfoList = driver
				.findElements(By.xpath("//a[text()='" + username + "']/parent::td/following-sibling::td"));

		System.out.println(userInfoList.size());
		List<String> infoList = new ArrayList<String>();// [], pc=0

		for (WebElement e : userInfoList) {
			String text = e.getText();
			System.out.println(text);
			infoList.add(text);
		}

		return infoList;
	}

	public static void selectUser(String username) {
		driver.findElement(
				By.xpath("//a[text()='" + username + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

}
