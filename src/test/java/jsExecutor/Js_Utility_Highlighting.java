package jsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;
//refer Utility class from helper package to call methods 
public class Js_Utility_Highlighting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Utility.highlightElement(driver, By.name("username")).sendKeys("Admin");//(WebElement element)
		Utility.highlightElement(driver,By.name("password")).sendKeys("admin123");//WebElement element
		Utility.highlightElement(driver, By.xpath("//button[@type='submit']")).click();//(By locator)
	}

}
