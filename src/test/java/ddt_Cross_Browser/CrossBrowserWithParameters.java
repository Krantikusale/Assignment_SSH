package ddt_Cross_Browser;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class CrossBrowserWithParameters {
	@Parameters("Browser")
	@Test
		public void login(String browserName) {
			WebDriver driver = Utility.startBrowser(browserName, "http://google.com");
			Reporter.log(driver.getTitle(), true);
			driver.quit();
		}
	}