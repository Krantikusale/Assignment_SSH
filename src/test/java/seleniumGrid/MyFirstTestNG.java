package seleniumGrid;

import org.testng.annotations.Test;

public class MyFirstTestNG {
	@Test(description = "My first test")
	public void test1() {
		System.out.println("TC-1 gets executed");
	}
	@Test(description = "My second test")
	public void test2()
	{System.out.println("TC-2 gets executed");}
	
	@Test(description = "TC-2 gets executed")
	public void test3()
	{System.out.println("TC-3 gets executed");}
}
