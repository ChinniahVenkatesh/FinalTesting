package TestingProject.finalTesting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports report;
	
	public static ExtentReports testReport()
	{
	report = new ExtentReports();
	String path = System.getProperty("user.dir")+"//reports//index.html";
	report.setSystemInfo("browser","chrome");
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("Test Report");
	reporter.config().setReportName("Arun");
	report.attachReporter(reporter);
	return report;
	}
}
