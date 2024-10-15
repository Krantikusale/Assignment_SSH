package jsExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Click {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//type using js-even element is disabled 
		js.executeScript("document.getElementById('login-username').value='java@gmail.com'");
		
		//click with js-force click
		js.executeScript("document.getElementById('persistent').click()");
		System.out.println("Click operation done successfully");

	}

}
