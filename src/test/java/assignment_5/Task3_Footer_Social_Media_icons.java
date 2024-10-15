package assignment_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_Footer_Social_Media_icons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1000);
		
		WebElement linkedin=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		String icon1=linkedin.getAttribute("href");
		System.out.println("Linkedin href is :"+icon1);
		
		WebElement facebook=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		String icon2=facebook.getAttribute("href");
		System.out.println("Facebook href is :"+icon2);
		
		WebElement twitter=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		String icon3=twitter.getAttribute("href");
		System.out.println("Twitter href is :"+icon3);
		
		WebElement youtube=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		String icon4=youtube.getAttribute("href");
		System.out.println("Youtube href is :"+icon4);
		driver.close();
	}

}
