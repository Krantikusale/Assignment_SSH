package seleniumTimeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		System.out.println(ele.isDisplayed());

	}

}
