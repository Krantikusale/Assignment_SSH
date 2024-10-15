package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		// driver.findElement(By.xpath("//input[@name='persistent']")).click();//ElementNotInteractableException
		driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();//we refering text of button's label
	}

}
