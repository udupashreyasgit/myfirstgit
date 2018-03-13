package completemaven;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestClassB {
	
	
	public static ExtentReports report;
	public static ExtentTest test;
	@Test
	public void bmethodd()
	{
		report = new ExtentReports("C:\\Users\\shreyasudupa\\Desktop\\prepare.html",false);
		test = report.startTest("test");
		System.out.print("bbbbbbbbbbbbbbbb");
		test.log(LogStatus.PASS, "first step", "passed");
		report.flush();
	}

}
