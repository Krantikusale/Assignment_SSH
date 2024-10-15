package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void test1()
	{
		Reporter.log("test1 strt",true);
		Assert.assertTrue(false);//normal Assert
		Reporter.log("test1 end ",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("test2 strt",true);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(false);//softAssert
		Reporter.log("test2 end ",true);
		softAssert.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
