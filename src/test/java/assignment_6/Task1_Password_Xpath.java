package assignment_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Password_Xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");// Using xpath
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='username']//following::input[1]")).sendKeys("admin123");//xpath_axes
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");// Contains xpath

		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("admin123");//Using CSS Selector
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name$='word']")).sendKeys("admin123");//Using CSS Selector
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("admin123");//Using CSS Selector
		driver.close();
	}
}
