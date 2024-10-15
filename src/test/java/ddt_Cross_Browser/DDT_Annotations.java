package ddt_Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Utility;

public class DDT_Annotations {
	WebDriver driver;

	@BeforeMethod
	public void setup()

	{
		Reporter.log("Setup", true);
		driver = Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/login");

		Reporter.log("app is up and running", true);
	}

	@AfterMethod
	public void closeSession() {
		Reporter.log("terminating session", true);
		driver.quit();
		Reporter.log("session terminated", true);
	}

	@Test(dataProvider = "loginData")
	public void test1(String email, String pwd) {
		WebDriver driver = Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.name("password1")).sendKeys(pwd);

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("vercel"));
	}

	@DataProvider(name = "loginData")
	public Object[][] getData() {
		Object[][] arr = new Object[3][2];
		arr[0][0] = "admin";
		arr[0][1] = "admin123";

		arr[1][0] = "selenium";
		arr[1][1] = "java";

		arr[2][0] = "testng";
		arr[2][1] = "maven";

		return arr;
	}

}