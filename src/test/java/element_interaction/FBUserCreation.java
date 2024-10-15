package element_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBUserCreation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("kranti");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kim");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("2345678909");
		driver.findElement(By.id("password_step_input")).sendKeys("K@kin3");
		// driver.findElement(By.xpath("//
		// input[@id='password_step_input']")).sendKeys("kk");
		WebElement dayDropDown = driver.findElement(By.cssSelector("select[title='Day']"));

		Thread.sleep(2000);
		Select day = new Select(dayDropDown);
		day.selectByIndex(8);

		WebElement monthDropDown = driver.findElement(By.cssSelector("select[title='Month']"));
		Thread.sleep(2000);
		Select month = new Select(monthDropDown);
		month.selectByValue("8");
		
		WebElement ele =month.getFirstSelectedOption();
		System.out.println(ele.getText());

		WebElement yearDropDown = driver.findElement(By.cssSelector("select[title='Year']"));
		Thread.sleep(2000);
		Select year = new Select(yearDropDown);
		year.selectByVisibleText("1990");
		
		WebElement gender= driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		Thread.sleep(2000);
		
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();

		
	}

}
