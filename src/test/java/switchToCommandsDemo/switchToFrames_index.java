package switchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrames_index {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		driver.switchTo().frame(0);
		WebElement prac=driver.findElement(By.xpath("//a[text()='Practise']"));
		prac.click();
		System.out.println("text of element is :"+prac.getText());
		driver.switchTo().defaultContent();
		System.out.println("Parent url is "+driver.getCurrentUrl());
		
		//driver.switchTo().parentFrame();

	}

}
