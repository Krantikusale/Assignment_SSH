package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IneuronSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.id("email1")).sendKeys("kk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password1")).sendKeys("Kranti@123");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.className("submit-btn")).click();
		// driver.close();
		 
		 

	}

}
