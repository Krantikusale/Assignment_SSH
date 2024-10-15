package ddt_Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class MouseHover {

	WebDriver driver;
	 @Parameters("Browser")
	@BeforeClass
	public void setUp() {
		Reporter.log("Browser setup", true);
		driver = Utility.startBrowser("Chrome", "https://www.google.com");
		Reporter.log("app running properly", true);
	}
	@Test
	public void strtBrowser() {
		driver.get("https://seleniumpractise.blogspot.com/search?q=mouse");
		driver.findElement(By.xpath("//button[text()='Automation Tools']")).click();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();
	}

	@AfterMethod
	public void close() {
		Reporter.log("closed session", true);
		driver.quit();
	}
}
