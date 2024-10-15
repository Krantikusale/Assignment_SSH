package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCmd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		Thread.sleep(1000);
		WebElement username=driver.findElement(By.id("email1"));
		Thread.sleep(1000);
		username.sendKeys("kk@gmail.com");
		Thread.sleep(1000);
		WebElement pwd=driver.findElement(By.id("password1"));
		Thread.sleep(1000);
		pwd.sendKeys("kk@89");
		Thread.sleep(1000);

		//  driver.close();
	}

}
