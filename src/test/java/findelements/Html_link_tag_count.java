package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_link_tag_count {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement ele : allLinks) {
			System.out.println("links are : " + ele.getText());
		}
		driver.quit();
	}

}
