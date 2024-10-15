package desiredCapability_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Execution {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		//opt.setHeadless(true);//its supported on selenium's before 3.x version
		opt.addArguments("--headless");//The args to use when starting Chrome	
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://learn-automation.com");
		System.out.println("title is : "+driver.getTitle());
		System.out.println("URL is : "+driver.getCurrentUrl());
	}

}
