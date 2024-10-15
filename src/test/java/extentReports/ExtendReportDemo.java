package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportDemo {
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
		t1.pass("Login success");

		report.flush();
	}
}
