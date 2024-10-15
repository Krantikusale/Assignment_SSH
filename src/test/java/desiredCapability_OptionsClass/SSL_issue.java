package desiredCapability_OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_issue {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cacert.org/");
		System.out.println("Title is : "+driver.getTitle());
		System.out.println("URL is : "+driver.getCurrentUrl());

	}

}
