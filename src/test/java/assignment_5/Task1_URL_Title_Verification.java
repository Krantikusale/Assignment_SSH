package assignment_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_URL_Title_Verification {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String url = driver.getCurrentUrl();
		System.out.println("Application URL is : " + url);
		System.out.println("     ");

		if (url.endsWith("login")) {
			System.out.println("URL verification passed: URL ends with 'login'");
		} else {
			System.out.println("URL verification failed: URL does not end with 'login'");
		}
		System.out.println("     ");

		if (url.contains("demo")) {
			System.out.println("URL verification passed: URL contains 'demo'");
		} else {
			System.out.println("URL verification failed: URL does not contains 'demo'");
		}
		System.out.println("     ");

		String title = driver.getTitle();

		System.out.println("Application title is : " + title);
		System.out.println("     ");
		if (title.contains("HRM")) {
			System.out.println("Title verification passed: Title contains 'HRM '");
		} else {
			System.out.println("Title verification failed: Title does not contains 'HRM '");
		}
		driver.close();
	}

}
