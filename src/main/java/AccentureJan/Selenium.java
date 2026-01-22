package AccentureJan;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) throws IOException, InterruptedException {
		String fi = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(fi);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cell = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cell);
		workbook.close();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String user = "admin";
		String pswd = "admin";
		String urls = "https://" + user + ":" + pswd + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(urls);
		driver.findElement(By.xpath("//a[text()=\"Elemental Selenium\"]")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> li = aw.iterator();
		while (li.hasNext()) {
			String cw = li.next();
			if (!pw.equals(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()=\"Take me to the tips! \"]")).click();
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for (WebElement link : links) {
					String url = link.getAttribute("href");
					System.out.println(url);
					File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screen, new File("./Images/images.png"));
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,4000)");
				}
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> productNames = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		for (WebElement pr : productNames) {
			actions.moveToElement(pr).perform();
			Thread.sleep(200);
			System.out.println(pr.getText());
		}

		driver.quit();
	}
}
