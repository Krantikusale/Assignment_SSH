package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_args {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=disable+textbox");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='Java'",password);//Single args
		
		//js.executeScript("arguments[0].value=arguments[1]",password,"c++","c");//ot is c++
		
		js.executeScript("arguments[0].value=arguments[2]",password,"c++","c");//multiple args , ot is c

	}

}
