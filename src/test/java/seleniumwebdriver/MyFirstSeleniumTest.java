package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) {
		FirefoxDriver driver1 =new FirefoxDriver();
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com");
		
		EdgeDriver driver2=new EdgeDriver();
		
		InternetExplorerDriver driver3=new InternetExplorerDriver();
		
	}

}
