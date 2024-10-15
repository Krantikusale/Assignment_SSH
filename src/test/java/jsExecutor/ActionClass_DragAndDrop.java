package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions act = new Actions(driver);
		// act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, dest).perform();
	}

}
