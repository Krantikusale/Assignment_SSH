package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_ActionClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/search?q=mouse");
		WebElement element=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();

	}

}
