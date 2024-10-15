package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./MyScreenshot.png");*/
		
		try 
		{
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./MyScreenshot1.png"));
		}
		catch (IOException e) 
		{
			System.out.println("Something went wrong " + e.getMessage());
		}
		driver.quit();

	}

}
