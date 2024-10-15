package webdrivercommands;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowcmd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		/*Options opt=driver.manage();
		Window win= opt.window();
		Thread.sleep(2000);
		win.maximize();*/
		
		driver.get("https://facebook.com");
		Thread.sleep(5000);

		driver.manage().window().maximize();//shorthand for same
		Thread.sleep(5000);

		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		
		 Dimension newSize = new Dimension(1024, 768);
		driver.manage().window().setSize(newSize);//Dimension object with desired width and height
		//driver.manage().window().setSize(new Dimension(1024, 768));
		Thread.sleep(2000);
		driver.quit();
		
	}

}
