package jan7_waits_screenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class WaitForAlertUsingWebDriverWait4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		
		wait.ignoring(WebDriverException.class);
		
		wait.pollingEvery(Duration.ofMillis(20));
		
		wait.withTimeout(Duration.ofSeconds(20));
		
		wait.until(new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver wd) {
				
				WebElement element=wd.findElement(By.xpath("//p[@id='demo']"));
				
				String text=element.getText();
				
				if(text.contains("WebDriver"))
				{
					System.out.println("Element found ");
					return element;
				}
				else
				{
					System.out.println("Current text is "+text);
					return null;
				}
			
			}
			
		
		});
		
		
	}

}
