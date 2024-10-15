package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_ScrollToElement {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		WebElement ele = driver.findElement(By.cssSelector("textarea"));
		Actions act = new Actions(driver);
		//act.moveToElement(frameElement).perform();//using js method
		act.moveToElement(ele).perform();//using actions class method
		System.out.println("done");
	}

}
