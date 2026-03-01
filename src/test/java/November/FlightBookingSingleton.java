package November;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Single-file Selenium automation using Singleton pattern.
 *
 * - Contains WebDriver singleton + page actions + validations in one class. -
 * Uses WebDriverManager to set up ChromeDriver.
 *
 * Notes: - Update locators if the site changes. - This file uses simple console
 * printing for test results (no TestNG). - Add Maven/Gradle dependencies for
 * selenium-java and webdrivermanager to run.
 *
 * Maven deps (pom.xml snippet): <dependency>
 * <groupId>org.seleniumhq.selenium</groupId>
 * <artifactId>selenium-java</artifactId> <version>4.15.0</version>
 * </dependency> <dependency> <groupId>io.github.bonigarcia</groupId>
 * <artifactId>webdrivermanager</artifactId> <version>5.6.3</version>
 * </dependency>
 */
public class FlightBookingSingleton {

	// -------------------------
	// Singleton WebDriver + Wait
	// -------------------------
	private static FlightBookingSingleton instance;
	private WebDriver driver;
	private WebDriverWait wait;

	// Page constants (update if the page changes)
	private final String BASE_URL = "https://rahulshettyacademy.com/dropdownsPractise/";
	private final By FROM_DROPDOWN = By.id("ctl00_mainContent_ddlFromPort");
	private final By TO_DROPDOWN = By.id("ctl00_mainContent_ddlToPort");
	private final By DEPARTURE_DATE = By.id("ctl00_mainContent_txtOnwardDate");
	private final By PASSENGERS_DROPDOWN = By.id("ctl00_mainContent_ddlPassengers");
	private final By SEARCH_BUTTON = By.id("ctl00_mainContent_btnSearch");

	// Validation constants
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
	private static final int MIN_PASSENGERS = 1;
	private static final int MAX_PASSENGERS = 9;

	// Private constructor to enforce singleton
	private FlightBookingSingleton() {
		initializeDriver();
	}

	// Thread-safe lazy singleton getter
	public static synchronized FlightBookingSingleton getInstance() {
		if (instance == null) {
			instance = new FlightBookingSingleton();
		}
		return instance;
	}

	// Initialize driver and wait
	private void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 30);
	}

	// Close and reset singleton (use at end)
	public synchronized void quit() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (Exception ignored) {
			}
			driver = null;
		}
		instance = null;
	}

	// -------------------------
	// Page actions
	// -------------------------
	public void openPage() {
		driver.get(BASE_URL);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FROM_DROPDOWN));
	}

	public void selectFromCity(String cityVisibleText) {
		WebElement from = wait.until(ExpectedConditions.elementToBeClickable(FROM_DROPDOWN));
		Select s = new Select(from);
		s.selectByVisibleText(cityVisibleText);
	}

	public void selectToCity(String cityVisibleText) {
		WebElement to = wait.until(ExpectedConditions.elementToBeClickable(TO_DROPDOWN));
		Select s = new Select(to);
		s.selectByVisibleText(cityVisibleText);
	}

	public void setDepartureDate(String dateDDMMYYYY) {
		WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(DEPARTURE_DATE));
		dateField.clear();
		dateField.sendKeys(dateDDMMYYYY);
	}

	public void selectPassengers(int count) {
		WebElement pax = wait.until(ExpectedConditions.elementToBeClickable(PASSENGERS_DROPDOWN));
		Select s = new Select(pax);
		s.selectByVisibleText(String.valueOf(count));
	}

	public void clickSearch() {
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(SEARCH_BUTTON));
		btn.click();
	}

	// -------------------------
	// Validations (pure Java)
	// -------------------------
	public static String validateInputs(String fromCity, String toCity, String departDate, int passengers) {
		if (fromCity == null || fromCity.trim().isEmpty()) {
			return "Please select FROM city";
		}
		if (toCity == null || toCity.trim().isEmpty()) {
			return "Please select TO city";
		}
		if (fromCity.equalsIgnoreCase(toCity)) {
			return "From and To cities cannot be same";
		}
		if (departDate == null || departDate.trim().isEmpty()) {
			return "Please select departure date";
		}
		if (!isValidDateFormat(departDate)) {
			return "Invalid date format. Use DD/MM/YYYY";
		}
		if (!isDateNotInPast(departDate)) {
			return "Departure date cannot be in past";
		}
		if (passengers < MIN_PASSENGERS) {
			return "Select at least " + MIN_PASSENGERS + " passenger(s)";
		}
		if (passengers > MAX_PASSENGERS) {
			return "Maximum " + MAX_PASSENGERS + " passengers allowed";
		}
		return null; // no error
	}

	public static boolean isValidDateFormat(String dateStr) {
		try {
			LocalDate.parse(dateStr, DATE_FORMATTER);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isDateNotInPast(String dateStr) {
		try {
			LocalDate selected = LocalDate.parse(dateStr, DATE_FORMATTER);
			LocalDate today = LocalDate.now();
			return !selected.isBefore(today);
		} catch (Exception e) {
			return false;
		}
	}

	// -------------------------
	// Example test flows (main)
	// -------------------------
	public static void main(String[] args) {
		FlightBookingSingleton app = FlightBookingSingleton.getInstance();

		// Test data examples
		String validFrom = "Bengaluru (BLR)"; // Update visible texts as on the dropdown if needed
		String validTo = "New Delhi (DEL)";
		String validDate = LocalDate.now().plusDays(7).format(DATE_FORMATTER); // 7 days from now
		int validPassengers = 2;

		// 1) Valid booking flow
		System.out.println("=== Test 1: Valid booking data ===");
		String err = validateInputs(validFrom, validTo, validDate, validPassengers);
		if (err != null) {
			System.out.println("Validation failed: " + err);
		} else {
			try {
				app.openPage();
				// NOTE: visible text in selects must match exactly the option on the site.
				// If the site shows "Bengaluru (BLR)" use that. If it shows "Bangalore", use
				// that.
				app.selectFromCity(validFrom);
				app.selectToCity(validTo);
				app.setDepartureDate(validDate);
				app.selectPassengers(validPassengers);
				app.clickSearch();
				System.out.println("Search clicked for valid data (manual verification of results may be needed).");
			} catch (Exception e) {
				System.out.println("Error during interaction: " + e.getMessage());
			}
		}

		// 2) Same FROM and TO validation
		System.out.println("\n=== Test 2: Same city validation ===");
		String sameCityErr = validateInputs("Bengaluru (BLR)", "Bengaluru (BLR)", validDate, 1);
		System.out.println("Expected error present? " + (sameCityErr != null ? sameCityErr : "No error (unexpected)"));

		// 3) Past date validation
		System.out.println("\n=== Test 3: Past date validation ===");
		String pastDate = "01/01/2020";
		String pastErr = validateInputs(validFrom, validTo, pastDate, 1);
		System.out.println("Expected error present? " + (pastErr != null ? pastErr : "No error (unexpected)"));

		// 4) Passenger min/max validation
		System.out.println("\n=== Test 4: Passenger count validation ===");
		System.out.println("Zero pax -> " + validateInputs(validFrom, validTo, validDate, 0));
		System.out.println("Too many pax -> " + validateInputs(validFrom, validTo, validDate, 12));

		// 5) Mandatory fields validation
		System.out.println("\n=== Test 5: Mandatory fields validation ===");
		System.out.println("Empty fields -> " + validateInputs("", "", "", 0));

		// Cleanup
		app.quit();
		System.out.println("\nFinished. Browser closed.");
	}
}