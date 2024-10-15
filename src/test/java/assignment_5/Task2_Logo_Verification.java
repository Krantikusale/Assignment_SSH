package assignment_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_Logo_Verification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));

		if (logo.isDisplayed()) {
			System.out.println("logo is present and displayed");
		} else {
			System.out.println("logo is not displayed");
		}
		
		driver.close();
	}

}
