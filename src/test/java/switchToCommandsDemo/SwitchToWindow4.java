package switchToCommandsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String parent_handle = driver.getWindowHandle();
	
		WebElement element=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
		Set<String> allWindowHAndles = driver.getWindowHandles();
		Iterator<String> itr = allWindowHAndles.iterator();
		while (itr.hasNext()) {
			String child = itr.next();
			if (!parent_handle.equals(child)) {
				driver.switchTo().window(child);
				String title = driver.getTitle();
				System.out.println("Title of application is " + title);
				driver.close();

			}
		}
		driver.switchTo().window(parent_handle);
		System.out.println("MAin application title is " + driver.getTitle());
		driver.quit();

	}

}
