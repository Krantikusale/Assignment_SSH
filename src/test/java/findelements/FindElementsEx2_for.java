package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsEx2_for {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		List<WebElement> allDDOptions = month.getOptions();
		int totalElements = allDDOptions.size();
		System.out.println("total elements are " + totalElements);
		for (int i = 0; i < totalElements; i++) {
			WebElement ele = allDDOptions.get(i);
			String value = ele.getText();
			if (value.contains("Aug")) {
				System.out.println("pass");
				break;
			}
		}
		driver.quit();

	}

}
