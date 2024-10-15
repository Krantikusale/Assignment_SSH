package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsEx1_for_each {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		List<WebElement> allDDOptions = month.getOptions();
		for (WebElement ele : allDDOptions) {
			String values = ele.getText();
			System.out.println("Values are : " + values);

			if (values.contains("Aug")) {
				System.out.println("Found");
				break;
			}

		}
		driver.quit();
	}

}
