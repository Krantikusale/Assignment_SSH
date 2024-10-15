package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Scroll_type {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		WebElement textarea = driver.findElement(By.xpath("//textarea"));// Webelement we need until element not in a
																			// view
		// driver.findElement(By.xpath("//textarea")).sendKeys("Selenium");//
		// ElementNotInteractableException

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		// js.executeScript("document.querySelector('textarea').scrollIntoView(true)",txtarea);
		js.executeScript("arguments[0].scrollIntoView(true)", textarea);
		Thread.sleep(2000);
		textarea.clear();
		textarea.sendKeys("Selenium");

	}

}
