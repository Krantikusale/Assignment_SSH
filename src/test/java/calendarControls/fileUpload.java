package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/file-upload-test.html");
		driver.findElement(By.id("fileinput"))
				.sendKeys("C:/Users/Pratap_G/OneDrive/Desktop/8c3c639685f4c7d14266705bc0fcbbc5.jpg");

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		ele.click();
		// System.out.println(ele.getText());
         //driver.quit();
	}

}
