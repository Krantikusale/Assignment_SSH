package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmd2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");

		System.out.println("navigated successfully");

	}

}
