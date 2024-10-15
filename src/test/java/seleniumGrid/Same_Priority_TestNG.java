package seleniumGrid;

import org.testng.annotations.Test;

public class Same_Priority_TestNG {
	@Test(priority = 1)
	public void login() {
		System.out.println("Login to app");
	}

	@Test(priority = 1)
	public void creatAccount() {
		System.out.println("Account created");
	}

	@Test(priority = 3)
	public void makePayment() {
		System.out.println("Payment Done");
	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("Logout from app");
	}

}
