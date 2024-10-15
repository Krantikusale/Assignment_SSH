package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCmd1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		
		WebElement username = driver.findElement(By.id("email1"));
		
		System.out.println("Display status is " + username.isDisplayed());
		System.out.println("Enable status is " + username.isEnabled());
		System.out.println("Placeholder values is " + username.getAttribute("placeholder"));
		System.out.println("CSS value is " + username.getCssValue("font-size"));
		
		username.sendKeys("kk@gmail.com");
		
		System.out.println("value fetched from username is " + username.getAttribute("value"));
	
	
	}

}
