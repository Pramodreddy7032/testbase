package genericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	public void onFinish(ITestContext arg0) {
		 
		
	}

	public void onStart(ITestContext arg0) {
		 
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		 
		
	}

	public void onTestFailure(ITestResult result) {
		TestBase tb = new TestBase();
			try {
				tb.captureScreenShot( result.getName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
	}

	public void onTestSkipped(ITestResult arg0) {
		 
		
	}

	public void onTestStart(ITestResult arg0) {
 
		
	}

	public void onTestSuccess(ITestResult arg0) {
		 
		
	}
	 

}
