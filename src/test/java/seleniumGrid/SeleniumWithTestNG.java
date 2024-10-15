package seleniumGrid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {
	WebDriver driver;

	@Test(priority = 1)
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
	}

	@Test(priority = 2)
	public void verifyURL() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("ineuron-courses"), "URL did not matched");
	}

	@Test(priority = 3)
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Courses"), "Title did not matched");
	}
	
	@Test(priority=4)
	public void footerCount()
	{
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='social']//a[@href]"));
		
		int count=ele.size();
		Assert.assertEquals(count, 4,"count not matched");
		System.out.println("Count of footer is "+count);
	}

	@Test(priority=5)
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("email1")).sendKeys("Automtion86@yahoo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing@123");
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(4000);
		String msg=driver.findElement(By.className("welcomeMessage")).getText();
		System.out.println("Actual message: " + msg);
				Assert.assertTrue(msg.contains("Welcome"),"doesn't conatins welcome");
	}
	
	@Test(priority=6)
	public void signOut() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		Thread.sleep(2000);
		String msg2=driver.findElement(By.xpath("//h2[text()='Sign In']")).getText();
		System.out.println("Actual message: " + msg2);
		Assert.assertTrue(msg2.contains("SIGN"),"doesn't conatins SIGN");
	}
	@Test(priority = 7)
	public void closeBrowser() {
		driver.quit();
//system.out.println("Browser got closed");}

	}

}
