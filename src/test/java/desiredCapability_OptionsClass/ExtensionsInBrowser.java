package desiredCapability_OptionsClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionsInBrowser {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		File src = new File("./Plugins/SelectorsHub.crx");
		opt.addExtensions(src);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
		System.out.println("title :" + driver.getTitle());
		System.out.println("URL : " + driver.getCurrentUrl());
	}

}
