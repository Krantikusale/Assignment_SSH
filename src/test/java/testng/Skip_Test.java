package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip_Test {
	@Test
	public void login() {
		Assert.assertTrue(false);
		Reporter.log("login to app.", true);
	}

	@Test(dependsOnMethods = "login")
	public void logOut() {
		Reporter.log("Logout from app", true);
	}

}
