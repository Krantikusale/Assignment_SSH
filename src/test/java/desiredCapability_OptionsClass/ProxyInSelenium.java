package desiredCapability_OptionsClass;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyInSelenium {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("123.67.87.90:9098");
		opt.setProxy(proxy);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");
		System.out.println("title "+driver.getTitle());
		System.out.println("URL "+driver.getCurrentUrl());

	}

}
