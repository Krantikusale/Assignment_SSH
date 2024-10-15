package calendarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar_Click_Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// launches a new instance of Chrome browser by calling its constructor.

		driver.get("https://seleniumpractise.blogspot.com/search?q=calendar");

		WebElement dateInput = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateInput.click();

		WebElement ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String monthYearText = ele.getText();
		System.out.println(monthYearText);

		WebElement element = driver.findElement(By.xpath("//a[text()='28']"));
		element.click();
		String day = element.getText();
		System.out.println(day);

		System.out.println("Full selected date: " + day + " " + monthYearText);
		System.out.println("*****************************");
		
		Thread.sleep(2000);
		
		dateInput.click();

		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();

		WebElement ele1 = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String monthYearText1 = ele1.getText();
		System.out.println(monthYearText1);

		WebElement element1 = driver.findElement(By.xpath("//a[text()='8']"));
		element1.click();
		String day1 = element1.getText();
		System.out.println(day1);

		System.out.println("Full selected date: " + day1 + " " + monthYearText1);

	}

}
