package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumSyntax {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://github.com/masumrazait");

		// Find The Listof href on website

		// Select class
//		WebElement country = driver.findElement(By.id("Country"));
//		Select select = new Select(country);
//		select.selectByValue("2");
//		select.selectByIndex(1);
//		select.selectByVisibleText("India");
//
//		// alert
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
//		alert.getText();

//		WebElement src = driver.findElement(By.id("name"));
//		WebElement trg = driver.findElement(By.id("name"));
//		Actions action = new Actions(driver);
//		action.dragAndDrop(src, trg).perform();
//		action.contextClick(src).perform();
//		action.moveToElement(trg).perform();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		String username = "admin";
		String password = "admin";
		String url = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);

		// ScreenShot
		File Screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screen, new File("image/image.png"));

		File Screena = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screena, new File("image/image.png"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");

		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("image/path.png"));

		String data = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(data);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String CellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(CellValue);

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (WebElement links : link) {
			String href = links.getAttribute("href");
			System.out.println(href);
		}
		driver.quit();

		ArrayList<Integer> list = new ArrayList<Integer>(
				Arrays.asList(11, 22, 333, 44, 455, 666, 544, 22, 22, 11, 33, 44, 55));
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println(set);

	}
}
