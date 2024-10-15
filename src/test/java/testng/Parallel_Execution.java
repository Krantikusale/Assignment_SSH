package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel_Execution {
	@Test
	public void test1() {
		System.out.println("ID is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
		Reporter.log("test1 is executed", true);
	}

	@Test
	public void test2() {
		System.out.println("ID is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
		Reporter.log("test2 is executed", true);
	}

	@Test
	public void test3() {
		System.out.println("ID is : " + Thread.currentThread().getId());
		System.out.println("Name is : " + Thread.currentThread().getName());
		Reporter.log("test3 is executed", true);
	}
}
