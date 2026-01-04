package utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {
		launchBrowser();
		driver.get("https://interviewlikeapro.blogspot.com/2024/06/QA-Tester.html");
		// force failure
		assert false;
	}

	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
