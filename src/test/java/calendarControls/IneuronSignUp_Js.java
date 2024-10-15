package calendarControls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.Select;

public class IneuronSignUp_Js {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kranti1");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kk90@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Javaj@123");
		driver.findElement(By.xpath("//label[text()='Testing']")).click();

		Thread.sleep(2000);
		 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//input[@value='Female']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		ele.click();
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		//js.executeScript("arguments[0].click;", ele);
		System.out.println("successful");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select state1 = new Select(state);
		state1.selectByValue("Maharashtra");

		driver.findElement(By.xpath("//button[text()='Sign up']")).click();

	}

}
