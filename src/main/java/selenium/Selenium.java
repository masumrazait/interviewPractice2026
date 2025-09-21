package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("hello"));

		WebDriverWait wait1 = new WebDriverWait(driver, 59);
		wait.until(ExpectedConditions.titleContains(""));
		String username = "";
		String password = "";
		String url = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);

		WebElement str = driver.findElement(By.className(""));
		Actions action = new Actions(driver);
		action.dragAndDrop(str, str).perform();
		action.moveToElement(str).perform();
		action.sendKeys(Keys.ENTER).perform();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys(" ");
		// for iframe
		driver.switchTo().frame(1);
		driver.switchTo().frame(str);
		driver.switchTo().defaultContent();

		// javascript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		js.executeScript("arguments[0].scrollIntoView(true);", str);

		String parent = driver.getWindowHandle();
		Set<String> S1 = driver.getWindowHandles();
		Iterator<String> i1 = S1.iterator();
		while (i1.hasNext()) {
			String childWindow = i1.next();
			if (!parent.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (WebElement links : link) {
			String href = links.getAttribute("href");
			System.out.println(href);

			HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
			connection.connect();
			int responseCode = connection.getResponseCode();
			if (responseCode >= 400) {
				System.out.println(links + " is a broken link");
			}
		}
		String data = "./testdata/testdata.xlsx";
		FileInputStream fis = new FileInputStream(data);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellvalue);

		driver.quit();
	}
}