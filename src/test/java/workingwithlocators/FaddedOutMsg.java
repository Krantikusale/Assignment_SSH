package workingwithlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaddedOutMsg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/");
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.id("email1")).sendKeys("kk@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Kranti@123");
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
		WebElement fade = driver.findElement(By.className("welcomeMessage"));
		String msg = fade.getText();
	}

}
