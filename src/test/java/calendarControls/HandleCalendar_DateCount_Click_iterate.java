package calendarControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar_DateCount_Click_iterate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// launches a new instance of Chrome browser by calling its constructor.

		driver.get("https://seleniumpractise.blogspot.com/search?q=calendar");

		WebElement dateInput = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateInput.click();

		List<WebElement> allElements = driver.findElements(By.xpath("//table[contains(@class,'calendar')]//a"));

		for (WebElement ele : allElements) {
			String dateText = ele.getText();
			System.out.println("dates are " + dateText);
			
			if (dateText.contains("9")) {
				System.out.println("great");
				ele.click();
				break;
				
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value"));
	//retrieve the current data in web form fields. To get this data, you use the getAttribute("value") method. This method accesses the value attribute from the HTML element.
	}

}
