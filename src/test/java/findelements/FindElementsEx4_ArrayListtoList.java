package findelements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FindElementsEx4_ArrayListtoList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2300);

		Select month = new Select(driver.findElement(By.id("month")));

		List<WebElement> allDDOptions = month.getOptions();
		/*
		 * System.out.println("previous list "); for (WebElement ele1 : allDDOptions) {
		 * 
		 * String text1 = ele1.getText(); System.out.println(text1);
		 * //ddValues.add(text1);
		 */
		List<String> ddValues = new ArrayList<String>();
		for (WebElement ele : allDDOptions) {
			String text = ele.getText();
			ddValues.add(text);

		}
		System.out.println(ddValues);

		driver.quit();
	}
}
