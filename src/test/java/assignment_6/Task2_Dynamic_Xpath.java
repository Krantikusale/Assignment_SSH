package assignment_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2_Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();// Using Xpath
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Admin']//following::a"));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(800);
		/*driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		Thread.sleep(800);
		
		 * List<WebElement> suggestions=driver.findElements(By.
		 * xpath("//div[contains(@class, 'oxd-autocomplete-option')]")); for(WebElement
		 * suggestion:suggestions) {System.out.println(suggestion.getText()); }
		 */

		WebElement roleDD = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		roleDD.click();
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//div[contains(text(),'Admin')]"));
		option.click();
		WebElement selectedOption = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		System.out.println("Selected Role: " + selectedOption.getText());

	}
}
