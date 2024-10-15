package waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForAlertWithoutUsingUtility {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=alert+demo");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alt = null;

		for (int a = 0; a <= 15; a++) {
			try {
				alt = driver.switchTo().alert();
				break;
			} catch (NoAlertPresentException e) {
				System.out.println("No alert found = Waiting for alert");
				Thread.sleep(1000);
			}
		}

		String str = alt.getText();
		System.out.println("Text is : " + str);
		alt.accept();
		driver.quit();

	}

}
