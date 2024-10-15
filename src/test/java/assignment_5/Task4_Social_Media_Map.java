package assignment_5;


import java.util.LinkedHashMap;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_Social_Media_Map {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(500);
		
		 Map<String, String> socialMediaLinks = new LinkedHashMap<>();
		
		WebElement facebook=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		String fburl=facebook.getAttribute("href");
		socialMediaLinks.put("Facebook", fburl);
		
		
		WebElement twitter=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		String twitter_url=twitter.getAttribute("href");
		socialMediaLinks.put("Twitter", twitter_url);
		
		WebElement youtube=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		String youtube_url=youtube.getAttribute("href");
		socialMediaLinks.put("Youtube ",youtube_url);
		
		WebElement linkedin=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		String linkedin_url=linkedin.getAttribute("href");
		socialMediaLinks.put("Linkedin ",linkedin_url);
		
		
		System.out.println(socialMediaLinks);
		
		System.out.println("  ");
		
		 for (Map.Entry<String, String> entry : socialMediaLinks.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        	
		}
		 driver.close();
	}

}
