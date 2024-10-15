package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Page_src {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String src = driver.getPageSource();
		System.out.println(" Google sourse code is : " + src);

 		// driver.quit();

		String url = driver.getCurrentUrl();
		System.out.println("url is : " + url);

		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
