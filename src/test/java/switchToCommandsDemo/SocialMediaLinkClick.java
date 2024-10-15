package switchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMediaLinkClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String parent = driver.getWindowHandle();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(1000);

		Set<String> allhandles = driver.getWindowHandles();

		for (String handle : allhandles) {

			driver.switchTo().window(handle);
			
			String title = driver.getTitle();
			String url = driver.getCurrentUrl();
			
			System.out.println("Title: " + title);
			System.out.println("URL: " + url);

			if (title.contains("X")) {
				System.out.println("Switched to window with title containing 'Twitter'"+"Current URL : " + driver.getCurrentUrl());
				break; // Exit the loop once the desired window is found
			}
		}
		

		driver.switchTo().window(parent);
		System.out.println("Returned to parent window with URL: " + driver.getCurrentUrl());
	}
}
