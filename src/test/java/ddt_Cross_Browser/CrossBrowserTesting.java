package ddt_Cross_Browser;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import helper.Utility;

public class CrossBrowserTesting {
	@Test
	public void login() {
		WebDriver driver = Utility.startBrowser("Chrome", "http://google.com");
		Reporter.log(driver.getTitle(), true);
		driver.quit();
	}
}
