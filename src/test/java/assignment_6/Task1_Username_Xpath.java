package assignment_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Username_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		WebElement element1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element1.sendKeys("Admin");element1.clear();
		String data=element1.getAttribute("value");
		System.out.println("Username is : "+data);//Using Xpath
		
		
		WebElement element2=driver.findElement(By.xpath("//input[@placeholder='Password']//preceding::input[1]"));
		Thread.sleep(1000);
		element2.sendKeys("Admin");
		String data1=element2.getAttribute("value");
		System.out.println("Username is : "+data1);//Using Xpath Axes
		
		
		WebElement element3=driver.findElement(By.xpath("//input[@name='username']"));
		element3.sendKeys("Admin");
		String data2=element3.getAttribute("value");
		System.out.println("Username is : "+data2);//Using Xpath 
		
		driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("Admin");//Using CSS selector
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("Admin");//Using CSS selector
		driver.findElement(By.cssSelector("input[class*='active']")).sendKeys("Admin");//Using CSS selector*/
		driver.close();		
	}

}
