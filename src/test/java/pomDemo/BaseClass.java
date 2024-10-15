package pomDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import helper.Utility;

public class BaseClass {
	WebDriver driver;

	@BeforeClass
	public void setupApp() {
		 //driver = Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/login");//
		driver = Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/");//for Home_Pg
		 
		 
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
