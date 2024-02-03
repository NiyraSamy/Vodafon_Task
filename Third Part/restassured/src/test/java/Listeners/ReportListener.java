package Listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ReportListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
		System.out.println("Test starting");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Status of execution is - "+result.getStatus());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Status of execution is - "+result.getStatus());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
