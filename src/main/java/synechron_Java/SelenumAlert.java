package synechron_Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelenumAlert {
	public static void main(String[] args) throws InterruptedException, IOException {

		String str = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(str);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cell = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cell);
		workbook.close();

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		// ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--headless");
		// WebDriver driver = new ChromeDriver(opt);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user = "admin";
		String pass = "admin";
		String app = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(app);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("masum");
		alert.accept();
		System.out.println(driver.getTitle());
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		WebElement src = driver.findElement(By.id("column-a"));
		WebElement trg = driver.findElement(By.id("column-b"));
		Actions action = new Actions(driver);
		action.dragAndDrop(src, trg).build().perform();
		System.out.println(driver.getTitle());
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// Locate all rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		for (int i = 1; i < rows.size(); i++) {
			// Locate columns for each row
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.print(col.getText() + " | ");
			}
			System.out.println();
		}
		driver.quit();
	}
}
