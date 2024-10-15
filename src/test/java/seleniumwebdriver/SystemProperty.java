 package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SystemProperty {

	public static void main(String[] args) {
		/*Option 1 - manual way should be use for 4.5.0 or below chrome driver  versions*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratap_G\\Downloads\\chrome-win64 (2)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.quit();
		
		/*Option 2 - use for 4.5.0 or below chrome driver-Use WebDriverManager - Checking browser ver,check do we have driver,if yes then download,cache,build path*/
		WebDriverManager.chromedriver().setup();
	}

}
