package switchToCommandsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String parent = driver.getWindowHandle();
		System.out.println("URL of main page is : " + driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		System.out.println("URLs are :"+driver.getWindowHandles());
		
		System.out.println("Title of child page after auto-switch : " + driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		System.out.println("Title of main page after switch back to parent page  : " + driver.getCurrentUrl());

	}

}
