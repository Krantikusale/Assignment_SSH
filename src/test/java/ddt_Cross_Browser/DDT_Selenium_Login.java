package ddt_Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Utility;

public class DDT_Selenium_Login {
@Test(dataProvider="loginData")
public void test1(String email,String pwd) 
{WebDriver driver=Utility.startBrowser("Chrome","https://ineuron-courses.vercel.app/login" );
driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
driver.findElement(By.name("password1")).sendKeys(pwd);

driver.findElement(By.xpath("//button[text()='Sign in']")).click();
System.out.println(driver.getCurrentUrl());
Assert.assertTrue(driver.getCurrentUrl().contains("vercel"));

/*driver.findElement(By.xpath("//button[text()='Sign out']")).click();

Assert.assertTrue(driver.getCurrentUrl().contains("/login"));*/
}

@DataProvider(name="loginData")
public Object[][] getData()
{Object [][] arr=new Object[3][2];
	arr[0][0]="k@gmail.com";
	arr[0][1]="admin123";
	
	arr[1][0]="k1@gmail.com";
	arr[1][1]="java";
	
	arr[2][0]="tester@gmail.com";
	arr[2][1]="Tester@123";

return arr;}
}

