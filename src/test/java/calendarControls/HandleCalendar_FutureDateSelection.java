package calendarControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar_FutureDateSelection {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// launches a new instance of Chrome browser by calling its constructor.

		driver.get("https://seleniumpractise.blogspot.com/search?q=calendar");

		WebElement dateInput = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateInput.click();
		
		String month=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
		String year=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
		
		System.out.println(month);
		System.out.println(year);
	/*driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	
	WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
	nextButton.click();
	
	if (month.equals("Aug") && year.equals("2025")) {
       System.out.println(); */
       
       	}
	}
	

	

