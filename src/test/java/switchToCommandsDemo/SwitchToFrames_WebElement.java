package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrames_WebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		WebElement frameElement=driver.findElement(By.xpath("//iframe[contains(@src,'ineuron')]"));
		driver.switchTo().frame(frameElement);
		
		WebElement prac=driver.findElement(By.xpath("//a[text()='Practise']"));
		prac.click();
		System.out.println("text of element is :"+prac.getText());
		driver.switchTo().defaultContent();
		System.out.println("Parent url is "+driver.getCurrentUrl());
		
	}

}
