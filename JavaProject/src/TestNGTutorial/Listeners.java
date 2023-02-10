package TestNGTutorial;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult tr) {
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("test Passed"); 
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test skipped");
	}

}
