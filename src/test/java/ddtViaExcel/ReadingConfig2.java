package ddtViaExcel;

import org.testng.annotations.Test;

import helper.ConfigReader;

public class ReadingConfig2 {
@Test
public void readConfig()
{
	String url=ConfigReader.getProperty("stagingURL");
	System.out.println(url);}
}
