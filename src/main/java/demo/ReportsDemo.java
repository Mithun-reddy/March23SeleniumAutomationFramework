package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsDemo {
	
	public static void main(String[] args) {
		
		String sFileNamePrefix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\reports\\"+sFileNamePrefix+"_SFDC.html";
		
//		Report configuration
		ExtentReports extent = new ExtentReports();
		ExtentHtmlReporter report = new ExtentHtmlReporter(filePath);
		extent.attachReporter(report);
		
//		We shall start creating reports for individual tests
		ExtentTest test = extent.createTest("TC01");
		test.log(Status.DEBUG, "User name is entered");
		test.log(Status.DEBUG, "password is entered");
		test.log(Status.DEBUG, "login button is clicked");
		test.log(Status.FAIL, "TC01 is failed");
		
		test = extent.createTest("TC02");
		test.log(Status.DEBUG, "User name is entered");
		test.log(Status.DEBUG, "password is entered");
		test.log(Status.DEBUG, "login button is clicked");
		test.log(Status.PASS, "TC02 is passed");
		
		extent.flush();
		
		
		
		
	}

}
