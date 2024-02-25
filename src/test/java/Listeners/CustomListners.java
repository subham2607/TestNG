package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements ITestListener{
	
	public void onStart(ITestContext arg) {
		System.out.println("starts Test execution......."+arg.getName());
	}
	
	public void onFinish(ITestContext arg) {
		System.out.println("Finish Test execution......."+arg.getName());
	}
	
	public void onTestStart(ITestResult arg) {
		System.out.println("starts Test execution......."+arg.getName());
	}
	
	public void onTestSkipped(ITestResult arg) {
		System.out.println("starts Test execution......."+arg.getName());
	}
	
	public void onTestSuccess(ITestResult arg) {
		System.out.println("starts Test execution......."+arg.getName());
	}
	
	public void onTestFailure(ITestResult arg) {
		System.out.println("starts Test execution......."+arg.getName());
	}
	
//	public void onTestFailedButWithinSuccessPercentage​(ITestResult arg0) {
//		System.out.println("starts Test execution......."+arg0.getName());
//	}
	
}
