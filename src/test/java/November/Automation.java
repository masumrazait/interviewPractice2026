package November;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String str = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(str);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cell = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cell);
		workbook.close();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> AllButton = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		System.out.println(AllButton.size());
		Actions action = new Actions(driver);
		for (WebElement Button : AllButton) {
			action.moveToElement(Button).build().perform();
			Button.click();
			Thread.sleep(40);
		}
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("./productPage/img.png"));
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		List<WebElement> prices = driver.findElements(
				By.xpath("//div[@class=\"cart-preview active\"]//descendant::div[@class=\"product-total\"]/p[2]"));
		int total = 0;
		System.out.println("totla price row is: " + prices.size());
		for (WebElement getPrice : prices) {
			action.moveToElement(getPrice).perform();
			int productPrice = Integer.parseInt(getPrice.getText());
			total += productPrice;
			System.out.println("product price: " + getPrice.getText() + " " + " as of now " + total);
		}
		driver.quit();
	}

}
