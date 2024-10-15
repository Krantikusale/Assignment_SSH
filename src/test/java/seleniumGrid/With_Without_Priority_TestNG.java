package seleniumGrid;

import org.testng.annotations.Test;

public class With_Without_Priority_TestNG {
	@Test
	public void login() {
		System.out.println("Login to app");
	}

	@Test(priority = 2)
	public void creatAccount() {
		System.out.println("Account created");
	}

	@Test
	public void makePayment() {
		System.out.println("Payment Done");
	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("Logout from app");
	}

}

