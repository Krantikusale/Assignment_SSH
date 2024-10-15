package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
WebDriver driver;
public  Home_Page(WebDriver driver)
{this.driver=driver;

	}

By loginButton=By.xpath("//button[text()='Log in ']");
public Login_Page clickOnLoginButton()
{
	driver.findElement(loginButton).click();
	
Login_Page login=new Login_Page(driver);
return login;
}
}
