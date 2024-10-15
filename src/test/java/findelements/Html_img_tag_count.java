package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_img_tag_count {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		List<WebElement> img = driver.findElements(By.xpath("//img[@src]"));
		for (WebElement ele : img) {
			System.out.println("img are : " + ele.getAttribute("src"));
		}
		driver.quit();
	}

}