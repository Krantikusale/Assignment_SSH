package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar_TypeDate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=calendar");
		// Option 1 :
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/09/2024");

		

	}

}
