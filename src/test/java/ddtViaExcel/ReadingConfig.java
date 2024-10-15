package ddtViaExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingConfig {
	@Test
	public void readConfig() throws IOException {
		File src = new File(System.getProperty("user.dir") + "/config/config.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.get("stagingURL"));
		System.out.println(pro.get("port"));
		System.out.println(pro.get("prodURL"));
		System.out.println(pro.get("test"));// if map doesn't contains mapping key

	}
}
