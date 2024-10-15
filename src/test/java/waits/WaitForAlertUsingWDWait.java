package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertUsingWDWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=alert+demo");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));// default polling is 500ms
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		String txt = alt.getText();
		System.out.println(txt);
		alt.accept();
		driver.quit();

	}

}
