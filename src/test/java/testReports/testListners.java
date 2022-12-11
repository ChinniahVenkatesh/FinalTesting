package testReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import TestingProject.finalTesting.ExtentReport;



public class testListners implements ITestListener{
	
	ExtentTest test;
	ExtentReports report = ExtentReport.testReport();
	ThreadLocal<ExtentTest> extest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
		extest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
		report.flush();
	}

}
