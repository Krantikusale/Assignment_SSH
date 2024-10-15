package seleniumGrid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PartialText_TestNG {
@Test
public void test1()
{
String msg="Cust id is 12345";
Assert.assertEquals(msg.contains("Cust"), true);
}


@Test
public void test2()
{
String msg="Cust id is 12345";
Assert.assertTrue(msg.contains("Cust "),"The msg if test fails");
}
}