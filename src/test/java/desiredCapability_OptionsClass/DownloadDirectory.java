package desiredCapability_OptionsClass;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadDirectory {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("download.default_directory","/Users/Pratap_G/OneDrive/Desktop/myDownload");
		op.setExperimentalOption("prefs", map);
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[text()='HR1.png']")).click();
 
	}

}
