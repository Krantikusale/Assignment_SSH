package switchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		WebElement element=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
		 
		Set<String> allHandles = driver.getWindowHandles();
		List<String> allHandleList = new ArrayList<String>(allHandles);
		driver.switchTo().window(allHandleList.get(1));
	}

}
