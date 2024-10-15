package findelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsEx3_Iterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);

		Select month = new Select(driver.findElement(By.name("birthday_month")));
		List<WebElement> allDDOptions = month.getOptions();
		int totalElements = allDDOptions.size();
		System.out.println("total elements are " + totalElements);

		Iterator<WebElement> itr = allDDOptions.iterator();
		while (itr.hasNext()) {
			WebElement ele = itr.next();
			String value = ele.getText();
			System.out.println(value);

			if (value.equals("Aug")) {
				System.out.println("Pass");
				break;
			}

		}
		driver.quit();

	}
}
