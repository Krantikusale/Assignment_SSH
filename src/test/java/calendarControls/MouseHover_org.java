package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.Utility;

public class MouseHover_org {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver(); 

driver.get("https://seleniumpractise.blogspot.com/search?q=mouse");
		driver.findElement(By.xpath("//button[text()='Automation Tools']")).click();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();
	}

}
