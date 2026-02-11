package AAMphasis2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://interviewlikeapro.blogspot.com/2024/07/blog-post.html");
		String fis = "./TestData/testdata.xlsx";
		FileInputStream f = new FileInputStream(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(f);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		workbook.close();
		String user = "admin";
		String password = "admin";
		String appUrl = "https://" + user + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(appUrl);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String pw = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> il = aw.iterator();
		while (il.hasNext()) {
			String cw = il.next();
			if (!pw.equals(cw)) {
				driver.switchTo().window(cw);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
				
				//SubHeading
				List<WebElement> lists = driver.findElements(By.xpath("//div[@class=\"row\"]/descendant::button[2]/child::small"));
				System.out.println(lists.size());
				Actions action = new Actions(driver);
				for (WebElement getList : lists) {
					action.moveToElement(getList).perform();
					Thread.sleep(50);
					System.out.println(getList.getText());
					continue;
				}
				//Heading
				List<WebElement> Headers = driver.findElements(By.xpath("//div[@class=\"card__header\"]//a"));
				System.out.println(Headers.size());
				for (WebElement getHeaders : Headers) {
					action.moveToElement(getHeaders).perform();
					Thread.sleep(50);
					System.out.println(getHeaders.getText());
					continue;
				}
				
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.quit();
	}
}
