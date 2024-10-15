package helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForAlertWithUtility {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=alert+demo");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alt=Utility.waitForAlert(driver);
		//Alert alt=Utility.waitForAlert(driver, 50);//another way , method overloading 

		String str = alt.getText();
		System.out.println("Text is : " + str);
		alt.accept();
		driver.quit();

}
}
