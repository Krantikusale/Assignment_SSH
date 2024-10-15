package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
	//driver.findElement(By.xpath("//input[@name='persistent']")).click();//using normal xpath,hence unable to click
		WebElement element =driver.findElement(By.xpath("//input[@name='persistent']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
		System.out.println("checkbox element is gets clicked");
	}

}
