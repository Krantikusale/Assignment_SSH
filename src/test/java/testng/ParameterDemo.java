package testng;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
@Parameters("Browser")
	@Test
public void test1(@Optional("Chrome")String browser)
{System.out.println("Thread id is "+Thread.currentThread().getId());
	Reporter.log("Browser nm is "+browser, true);
	}
}
 