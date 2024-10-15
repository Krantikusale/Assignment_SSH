package pomDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import helper.Utility;
import org.testng.annotations.Test;

public class LogintestUsingPOM_DynamicData extends BaseClass{
	@Test
	public void validLogin() {
Home_Page home=new Home_Page(driver);
home.clickOnLoginButton();
		Login_Page_Dynamic_data login = new Login_Page_Dynamic_data(driver);
		login.loginToApp1("tester@gmail.com","Tester@123");
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed());
	}
}
 