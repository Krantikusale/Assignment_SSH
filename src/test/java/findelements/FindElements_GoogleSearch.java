package findelements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		Thread.sleep(2000);
		List<WebElement> allValues = driver.findElements(By.xpath("//div[@role='option']"));

		System.out.println(allValues.size());
		for (WebElement ele : allValues) {
			String text = ele.getText();
			if (text.contains("cypress")) {
				ele.click();
				break;
			}
		}
		driver.quit();

	}

}
