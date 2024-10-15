package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_yahoo_login_click_type {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
		WebElement username= driver.findElement(By.id("login-username"));
		WebElement checkbox=driver.findElement(By.name("persistent"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]",username,"kk@gmail.com");
		js.executeScript("arguments[0].click()",checkbox);
	}

}
