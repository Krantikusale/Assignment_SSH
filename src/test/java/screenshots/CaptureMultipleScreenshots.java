package screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class CaptureMultipleScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Utility.captureScreenshot(driver);
		Utility.waitForSeconds(2);
		Utility.captureScreenshot(driver);
		Utility.waitForSeconds(2);

		Utility.captureScreenshot(driver);
		Utility.waitForSeconds(5);

		Utility.captureScreenshot(driver);

		driver.quit();
	}

}
