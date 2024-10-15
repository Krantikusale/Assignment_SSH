package switchToCommandsDemo;

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
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("krantiTester");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automtion82@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//label[text()='Testing']")).click();

		Thread.sleep(3000);
try {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
}
catch(Exception e)
{
		System.out.println("WebElement click failed - Retry with JS click");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement gender=driver.findElement(By.xpath("//input[@value='Female']"));
		js.executeScript("arguments[0].click()",gender);
		String value=gender.getAttribute("value");
		System.out.println("Gender selection value is : " +value);
}
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select state1 = new Select(state);
		state1.selectByValue("Maharashtra");
		System.out.println("State selection done successfully");
		
		
		boolean statusAfter=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		System.out.println("Sign up button Status after entering values is : " + statusAfter);
		
		try {
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();//Verifing Sign up button is enabled & click on it
		}
		catch(Exception e) {
			System.out.println("WebElement click failed -Retry with JS click");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element=driver.findElement(By.xpath("//button[text()='Sign up']"));
			js.executeScript("arguments[0].click()",element);
			
		}
		 
		Thread.sleep(3000);

		driver.findElement(By.id("email1")).sendKeys("Automtion82@yahoo.com");
		driver.findElement(By.id("password1")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Verify user is created or not (by login with same credentials)
		System.out.println("Login done successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		System.out.println("Logout done successfully");
	}
}
