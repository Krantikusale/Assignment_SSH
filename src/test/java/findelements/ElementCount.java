package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2300);

		List<WebElement> allInputTag = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("allInputTag are : " + allInputTag.size());
		System.out.println("input tag names are :");
		for (WebElement ele : allInputTag) {
			String name = ele.getAttribute("name");
			System.out.println(name);
		}
		System.out.println("*****************************");
		// int totalDD = driver.findElements(By.tagName("select")).size();
		List<WebElement> totalDD = driver.findElements(By.tagName("select"));
		totalDD.size();
		System.out.println("totalDD are : ");
		for (WebElement dd : totalDD) {
			String name = dd.getAttribute("id");
			System.out.println(name);
		}
		System.out.println("*****************************");
		int totalDDWithXpath = driver.findElements(By.xpath("//select")).size();
		System.err.println("totalDDWithXpath are : " + totalDDWithXpath);

		int totalPassword = driver.findElements(By.xpath("//input[@type='password']")).size();
		System.out.println("totalPassword are : " + totalPassword);

		int totalRadio = driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("totalRadio are :" + totalRadio);

	}

}
