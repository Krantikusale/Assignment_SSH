package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_TypeInDisabledField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=disable+textbox");
		// while using selenium methods we get ElementNotInteractableException
		// driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Java");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('pass').value='Java'");
	}

}
