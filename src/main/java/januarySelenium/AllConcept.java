package januarySelenium;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllConcept {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://masumrazait.netlify.app/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./Images/image1.png"));
		System.out.println(driver.getTitle());
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> l1 = allWindow.iterator();
		while (l1.hasNext()) {
			String childWindow = l1.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(img, new File("./Images/image2.png"));
				Thread.sleep(3000);
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		String userName = "admin";
		String password = "admin";
		String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pWindow = driver.getWindowHandle();
		Set<String> aWindow = driver.getWindowHandles();
		Iterator<String> I1 = aWindow.iterator();
		while (I1.hasNext()) {
			String cWindow = I1.next();
			if (!pWindow.equalsIgnoreCase(cWindow)) {
				driver.switchTo().window(cWindow);
				File sShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sShot, new File("./Images/image3.png"));
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(pWindow);
		}

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());

		String inputData = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(inputData);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String CellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(CellValue);
		workbook.close();
		String urls = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(urls);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pW = driver.getWindowHandle();
		Set<String> Aw = driver.getWindowHandles();
		Iterator<String> m1 = Aw.iterator();
		while (m1.hasNext()) {
			String cw = m1.next();
			if (!pW.equalsIgnoreCase(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				WebElement menu = driver.findElement(By.xpath("//button[text()='Categories']"));
				Actions action = new Actions(driver);
				action.moveToElement(menu).perform();
				driver.findElement(By.xpath("//a[text()='tools']")).click();
				List<WebElement> cards = driver.findElements(By.xpath("//div[@class='card__header']//h3/a"));
				for (WebElement card : cards) {
					String Links = card.getAttribute("href");
					System.out.println(Links);
					Thread.sleep(3000);
				}
				driver.close();
			}
			driver.switchTo().window(pW);
		}
		driver.quit();
	}

}
