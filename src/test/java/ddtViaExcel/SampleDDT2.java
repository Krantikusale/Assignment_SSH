package ddtViaExcel;

import org.testng.annotations.Test;

import helper.CustomDataProvider;

public class SampleDDT2 {
		@Test(dataProvider = "EmpDataSet",dataProviderClass=CustomDataProvider.class)
		public void sample(String fname, String lname, String email, String cost, String location) {
			
				System.out.println("Test Started");
				System.out.println(fname);
				System.out.println(lname);
				System.out.println(email);
				System.out.println(cost);
				System.out.println(location);
				System.out.println("Test Completed");
			}
		
}
