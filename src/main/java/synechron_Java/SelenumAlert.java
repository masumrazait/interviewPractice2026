package synechron_Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user = "admin";
		String pass = "admin";
		String app = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(app);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}
}
