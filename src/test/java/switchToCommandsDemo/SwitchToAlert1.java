package switchToCommandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Click to show']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();

	}

}
