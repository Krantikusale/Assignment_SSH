package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	By user = By.id("email1");
	By pass = By.name("password1");
	By login = By.xpath("//button[text()='Sign in']");

	public DashBoard loginToApp() {
		driver.findElement(user).sendKeys("tester@gmail.com");
		driver.findElement(pass).sendKeys("Tester@123");
		driver.findElement(login).click();
		
		return new DashBoard();

	}
}
