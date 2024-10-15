package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();// opening url
		driver.get("https://www.google.com");//loading URL
		String googleTitle = driver.getTitle();//fetching Title
		String googleURL = driver.getCurrentUrl();//Fetching current URL
		System.out.println(" Title is : " + googleTitle + " , " + " URL is : " + googleURL);

		driver.get("https://www.gmail.com");
		String gmailTitle = driver.getTitle();
		String gmailURL = driver.getCurrentUrl();
		System.out.println(" Title is : " + gmailTitle + " , " + " URL is : " + gmailURL);
		Thread.sleep(2000);

		driver.get("https://www.facebook.com");
		String FBTitle = driver.getTitle();
		String FBURL = driver.getCurrentUrl();
		System.out.println(" Title is : " + FBTitle + " , " + "URL is : " + FBURL);

		System.out.println("Chrome started");

		driver.quit();
	}

}
