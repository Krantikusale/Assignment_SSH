package assignment9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.Select;

public class IneuronLogin_Logout_js {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ineuron-courses.vercel.app/signup");
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean statusBefore = ele.isEnabled();// Verification of Sign up button is disabled
		System.out.println("Sign up button Status before entering values is : " + statusBefore);

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("krantiTester");
		String user_Name = name.getAttribute("value");
		System.out.println("User Name is : " + user_Name);

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Automtion87@yahoo.com");
		String user_Email = email.getAttribute("value");
		System.out.println("User Email_ID is : " + user_Email);

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Testing@123");
		String user_Password = password.getAttribute("value");
		System.out.println("User Password is : " + user_Password);

		WebElement course = driver.findElement(By.xpath("//label[text()='Testing']"));
		course.click();
		String user_course = course.getText();
		System.out.println("User course is : " + user_course);

		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		} catch (Exception e) {
			System.out.println("WebElement click failed - Retry with JS click");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
			js.executeScript("arguments[0].click()", gender);
			String value = gender.getAttribute("value");
			System.out.println("Gender selection value is : " + value);
		}
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select state1 = new Select(state);
		state1.selectByValue("Maharashtra");
		String value = state.getAttribute("value");
		System.out.println("State is : " + value);
		System.out.println("State selection done successfully");

		boolean statusAfter = driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		System.out.println("Sign up button Status after entering values is : " + statusAfter);

		try {
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();// Verifing Sign up button is enabled &
																				// click on it
		} catch (Exception e) {
			System.out.println("WebElement click failed -Retry with JS click");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//button[text()='Sign up']"));
			js.executeScript("arguments[0].click()", element);

		}

		Thread.sleep(3000);

		WebElement login_email = driver.findElement(By.id("email1"));
		login_email.sendKeys("Automtion87@yahoo.com");
		String login_email_ID = login_email.getAttribute("value");
		System.out.println("User Login_Email_ID is : " + login_email_ID);

		WebElement login_password = driver.findElement(By.id("password1"));
		login_password.sendKeys("Testing@123");
		String login_pwd = login_password.getAttribute("value");
		System.out.println("User Login_Password is : " + login_pwd);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Verify user is created or not (by login with same credentials)
		System.out.println("Login done successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		System.out.println("Logout done successfully");
	}
}
