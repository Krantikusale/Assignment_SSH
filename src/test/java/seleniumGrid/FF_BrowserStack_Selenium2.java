package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FF_BrowserStack_Selenium2 {

	
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("bstack:options", "{\"os\":\"Windows\",\"osVersion\":\"8\"}");
			//cap.setCapability("osVersion","10");
			cap.setCapability("browserName","Firefox");
			cap.setCapability("browserVersion", "120.0");
			
			URL seleniumGrid=new URL("http://kranti_52ZzcG:MGDwveqs9B8YmjjW4P6y@hub.browserstack.com/wd/hub");
			WebDriver driver= new RemoteWebDriver(seleniumGrid,cap);
			Thread.sleep(2000);
			driver.get("https://www.google.com/");
			
			System.out.println("Title : "+driver.getTitle());
			driver.quit();

		}

	}

