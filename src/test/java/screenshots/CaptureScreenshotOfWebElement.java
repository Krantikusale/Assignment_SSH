package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenshotOfWebElement {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement ele = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
				
		Utility.captureScreenshotOfWebElement(driver,ele);
		 Utility.captureScreenshot(driver);
		Utility.waitForSeconds(2);

	}

}
