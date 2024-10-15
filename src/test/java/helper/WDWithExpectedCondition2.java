package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WDWithExpectedCondition2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/search?q=explicit+wait");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		String txt = ele.getText();
		System.out.println(txt);

	}

}
