package pomDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import helper.Utility;
import org.testng.annotations.Test;

public class LogintestUsingPOM {
	@Test
	public void validLogin() {

		WebDriver driver = Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/login");
		Login_Page login = new Login_Page(driver);
		login.loginToApp();
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed());
		driver.quit();
	}
}
