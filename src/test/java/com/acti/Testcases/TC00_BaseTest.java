package com.acti.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.acti.Base.DriverScript;
import com.acti.Pages.EnterTimePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.TaskPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TC00_BaseTest extends DriverScript {
	
	public ExtentReports extent;
	public ExtentTest logger;
	LoginPage lp;
	EnterTimePage et;
	TaskPage tp;
	
	public TC00_BaseTest()
	{
		//initialize base class constructor
		super();
	}
	
	@BeforeClass
	public void reportSetup()
	{
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("./acti.reports/AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
	}
	
	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		lp = new LoginPage();
		et = new EnterTimePage();
		tp = new TaskPage();
	}
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
		extent.flush();
	}

}





