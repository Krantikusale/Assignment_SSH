package assignment_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Login_Button_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();//Using Xpath
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();//Using text()
		driver.findElement(By.xpath("//input[@type='password']//following::button")).click();//Using xpath axes
		
		
		driver.findElement(By.cssSelector("button.oxd-button--main")).click();
		driver.findElement(By.cssSelector("button[type='submit'].oxd-button--main")).click();
		
		
		driver.close();
	}

}
