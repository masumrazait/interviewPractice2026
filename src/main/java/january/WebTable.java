package january;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");

		File Screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screen, new File("./Images/image.png"));

		int Rowcount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//tr")).size();
		int Colcount = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//th")).size();

		for (int i = 1; i < Rowcount; i++) {
			for (int j = 1; j <= Colcount; j++) {
				String act = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + (i + 1) + "]/td[" + j + "]"))
						.getText();
			}
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
