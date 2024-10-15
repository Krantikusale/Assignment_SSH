package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		// Thread.sleep(2000);
		// driver.findElement(By.name("btnI")).click();//value="I'm Feeling Lucky"
		// driver.findElement(By.name("btnK")).click();//value="Google Search"

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('btnK')[0].click()");
	}

}
