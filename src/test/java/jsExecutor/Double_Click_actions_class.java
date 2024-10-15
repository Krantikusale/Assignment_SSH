package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_actions_class {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://api.jquery.com/dblclick/");
	WebElement ele = driver.findElement(By.cssSelector("iframe"));
	 driver.switchTo().frame(ele);
	Actions act = new Actions(driver);
	WebElement elementToDoubleClick = driver.findElement(By.xpath("//span[text()='Double click the block']"));
	//act.moveToElement(frameElement).perform();//using js method
	act.doubleClick(elementToDoubleClick).perform();//using actions class method
	System.out.println("done");
}
}
