package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ineuron_Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.id("email1")).sendKeys("Automtion1@yahoo.com");
		driver.findElement(By.id("password1")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Verify user is created or not (by login with same credentials)
		System.out.println("Login done successfully");
	}

}
