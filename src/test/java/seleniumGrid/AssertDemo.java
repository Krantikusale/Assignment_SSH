package seleniumGrid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test
	public void test1() {
		Assert.assertEquals(901, 901,"count mismatch");
		System.out.println("pass");
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(901, 902,"count mismatch");
		//Assert.assertEquals(902, 902,"count mismatch");
		System.out.println("fail");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(901, 901.0,"count mismatch");
		System.out.println("pass");
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("kranti", "kranti","count mismatch");
		System.out.println("pass");
	}
	
}
