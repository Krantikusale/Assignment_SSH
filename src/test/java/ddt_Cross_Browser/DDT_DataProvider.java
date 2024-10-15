package ddt_Cross_Browser;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_DataProvider {
@Test(dataProvider="loginData")
public void test1(String uname,String pwd)
{Reporter.log(uname,true);
Reporter.log(pwd,true);
	}

@DataProvider(name="loginData")
public Object[][] getData()
{Object [][] arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="admin123";
	
	arr[1][0]="selenium";
	arr[1][1]="java";
	
	arr[2][0]="testng";
	arr[2][1]="maven";

return arr;}
}
