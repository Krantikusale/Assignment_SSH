package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel_Classes_Execution_Selenium2 {
	@Test
	public void test1() {
		System.out.println("ID is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
		WebDriver driver=new ChromeDriver();
		driver.get("http://yahoo.com");
	}

	@Test
	public void test2() {
		System.out.println("ID is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
		WebDriver driver=new ChromeDriver();
		driver.get("http://ineuron.com");
	}

	@Test
	public void test3() {
		System.out.println("ID is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
	}
}
