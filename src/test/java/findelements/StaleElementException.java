package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("kk1@gmail.com");
		driver.navigate().refresh();
		ele.sendKeys("kk111@gmail.com");

	}

}
