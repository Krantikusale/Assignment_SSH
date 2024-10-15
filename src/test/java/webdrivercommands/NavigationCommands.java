package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.get("https://twitter.com");
		
		Navigation nav=driver.navigate();
		nav.back();//method 1
		
		driver.navigate().back();//method 2
		
		System.out.println("nav back done successfully");
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println("nav forward and refresh done successfully");
		
	}

}
