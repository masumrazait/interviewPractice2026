package selenumOct;

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

public class AllConcept {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String username = "admin";
		String password = "admin";
		String url = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> il = allWindow.iterator();
		while (il.hasNext()) {
			String childWindow = il.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				List<WebElement> link = driver.findElements(By.tagName("a"));
				System.out.println(link.size());
				for (WebElement links : link) {
					String href = links.getAttribute("href");
					System.out.println("links are on page:" + href);
				}
				driver.close();
			}
		}
		String testdata = "./TestData/testdata.xlsx";

		FileInputStream input = new FileInputStream(testdata);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);

		driver.switchTo().window(parentWindow);
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("macbook pro");
		Thread.sleep(4000);

		List<WebElement> suggList = driver.findElements(By.xpath("//a[@class='oleBil']/div[2]"));
		System.out.println(suggList.size());

		for (int i = 0; i < suggList.size(); i++) {
			String text = suggList.get(i).getText();
			System.out.println(text);
			if (text.contains("m4 max")) {
				suggList.get(i).click();
				break;
			}
		}
		driver.quit();
	}
}
