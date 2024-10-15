package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.Select;

public class Ineuron_SignUp_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ineuron-courses.vercel.app/signup");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean btn = ele.isEnabled();// Verification of Sign up button is disabled
		System.out.println("Sign up button status is : " + btn);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("krantiTester");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automtion91@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//label[text()='Testing']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Female']")).click();
		System.out.println("Gender selection done successfully");

		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select state1 = new Select(state);
		state1.selectByValue("Maharashtra");
		System.out.println("State selection done successfully");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();//Verifing Sign up button is enabled & click on it
		System.out.println("Sign up done successfully");
		 
		Thread.sleep(2000);

		driver.findElement(By.id("email1")).sendKeys("Automtion91@yahoo.com");
		driver.findElement(By.id("password1")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Verify user is created or not (by login with same credentials)
		System.out.println("Login done successfully");
	}
}
