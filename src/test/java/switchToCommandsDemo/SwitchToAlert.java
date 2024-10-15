package switchToCommandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Click to see after 5s']")).click();
		
		 
			for(int a=0;a<10;a++)
			{
				try {Alert alt = driver.switchTo().alert();
				
			String text = alt.getText();
			System.out.println("text of Alert is : "+text);
			
			if(text.contains("code"))
			{System.out.println("Pass");}
			else {
				System.out.println("fail");
			}
			
			alt.accept();
			break;
			
			}
			catch(NoAlertPresentException e)
			{System.out.println("waiting for alert to appear");
			Thread.sleep(1000);}
		}
		
	}

}
