package AAMphasis2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class NetworkInfo {
	String name;
	double network;
	public NetworkInfo(String name, double network) {
		this.name = name;
		this.network = network;
	}
}

public class DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll to dropdown
		js.executeScript("window.scrollBy(0,500)");
		// Select France dynamically
		List<WebElement> countries = driver.findElements(By.xpath("//select[@id='country']/option"));
		for (WebElement country : countries) {
			if (country.getText().equals("France")) {
				country.click();
				break;
			}
		}
		Thread.sleep(2000);
		// Handle Slider
		WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlider, 50, 0).perform();
		act.dragAndDropBy(maxSlider, -50, 0).perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		// Get headers dynamically
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='taskTable']//th"));
		System.out.println("==================================================================================");
		int networkColumnIndex = 0;
		for (int i = 0; i < headers.size(); i++) {
			System.out.print(headers.get(i).getText() + "   ||   ");
			if (headers.get(i).getText().equals("Network (Mbps)")) {
				networkColumnIndex = i;
			}
		}
		System.out.println();
		System.out.println("==================================================================================");
		// Get rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		List<NetworkInfo> networkList = new ArrayList<>();
		// Print table and capture network
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + "   ||   ");
			}
			String name = cells.get(0).getText();
			String networkText = cells.get(networkColumnIndex).getText().replace(" Mbps", "").trim();
			double networkValue = Double.parseDouble(networkText);
			networkList.add(new NetworkInfo(name, networkValue));
			System.out.println();
			System.out.println("==================================================================================");

		}
		// Sort lowest to highest
		networkList.sort(Comparator.comparingDouble(n -> n.network));
		System.out.println();
		System.out.println("Network Speed LOW to HIGH");

		System.out.println("==================================================================================");
		for (NetworkInfo data : networkList) {
			System.out.println(data.name + " : " + data.network + " Mbps");
		}
		// Lowest
		NetworkInfo lowest = networkList.get(0);
		System.out.println();
		System.out.println("Lowest Network is : " + lowest.name + " : " + lowest.network + " Mbps");

		// Highest

		NetworkInfo highest = networkList.get(networkList.size() - 1);
		System.out.println("Highest Network is : " + highest.name + " : " + highest.network + " Mbps");
		driver.quit();

	}
}
