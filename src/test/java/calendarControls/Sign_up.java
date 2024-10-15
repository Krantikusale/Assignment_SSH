package calendarControls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_up {

    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
        
        try {
            driver.manage().window().maximize();
            driver.get("https://ineuron-courses.vercel.app/signup");

            // Wait for elements to be visible and interactable
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']"))).sendKeys("kranti1");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys("kk1@yahoo.com");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))).sendKeys("Javaj@123");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Testing']"))).click();

            // Wait for the "Female" radio button to be clickable
            WebElement femaleOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Female']")));
            femaleOption.click();
            System.out.println("Gender selection successful");

            // Handle the state dropdown
            WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='state']")));
            Select stateSelect = new Select(state);
            stateSelect.selectByValue("Maharashtra");

            // Click the Sign up button
            WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign up']")));
            signUpButton.click();
            
            System.out.println("Sign-up successful");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Ensure the browser is closed
        }
    }
}
