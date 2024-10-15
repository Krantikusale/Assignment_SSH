package desiredCapability_OptionsClass;



import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prac {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Set Chrome options
        ChromeOptions op = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();

        // Set the download directory
        prefs.put("download.default_directory", "/Users/Pratap_G/OneDrive/Desktop/myDownload");
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.enabled", true);

        op.setExperimentalOption("prefs", prefs);
        
        // Specify a custom user data directory
        op.addArguments("/Users/Pratap_G/OneDrive/Desktop/myDownload");

        // Initialize the WebDriver with the Chrome options
        WebDriver driver = new ChromeDriver(op);
        driver.get("https://the-internet.herokuapp.com/download");
        
        // Click on the file to download
        driver.findElement(By.xpath("//a[text()='HR1.png']")).click();

        // Optional: Wait to ensure the download completes before closing
        try {
            Thread.sleep(5000); // Adjust as necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
