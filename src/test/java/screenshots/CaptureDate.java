package screenshots;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		Date d= new Date();//we use java.util.Date  package
		System.out.println("Date is "+d);
		
		SimpleDateFormat custDateFormat=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
		String date=custDateFormat.format(d);
		System.out.println("Custome date is : "+date);
		
		/* String date=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy").format(new Date()); */
		
	}

}
