
	package extentReports;

	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;
public class Test_Status{
	@Test
		public void generateReport() {
			ExtentReports report = new ExtentReports();

			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
					System.getProperty("user.dir") + "/reports/MyHtmlReport.html");
			sparkReporter.config().setReportName("Automation Report");
			sparkReporter.config().setTheme(Theme.STANDARD);
			sparkReporter.config().setDocumentTitle("Sprint 1 Automation Report");
			report.attachReporter(sparkReporter);

			ExtentTest t1 = report.createTest("Login Test");
			t1.pass("Start app");
			t1.pass("Enter Uname");
			t1.pass("Enter pwd");
			t1.fail("Login not successful");

			ExtentTest t2 = report.createTest("Payment Status");
			t2.fail("Payment Test failed",MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/Pratap_G/OneDrive/Desktop/abc.jpg").build());
			
			ExtentTest t3 = report.createTest("Account Status");
			t3.skip("Account test skip");
			
			report.flush();
	}
	}
