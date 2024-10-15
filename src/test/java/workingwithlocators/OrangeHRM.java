package workingwithlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.close();
		
		// WebElement nm=driver.findElement(By.cssSelector("input[name='username']"));
		// nm.sendKeys("admin");
		// WebDriverWait wait = new WebDriverWait(driver, 10);

	}

}
