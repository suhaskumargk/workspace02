package com.qa.base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.IReporterConfig;
import org.testng.xml.XmlSuite;

public class TestBaseClass implements ISuiteListener, ITestListener , IReporter{
	
	public static final int PAGE_LOAD_TIMEOUT = 300;
	public static final byte IMPLICIT_WAIT = 60;
	public static final byte WAIT_TIME_OUT_SEC = 30;
	public static final int AJAX_WAIT = 200;
	
	private static WebDriver driver;
	private static String url;
	private static String suiteName;
	private static String applicationName;
	private static String userName;
	private static String password;

	public SoftAssert softArrert;
	
	String projectdir = System.getProperty("user.dir");
	
	
//	*********************************ISuiteListener*********************************
	
	@Override
	public void onStart(ISuite suite) {
		driver = new ChromeDriver();
		System.out.println("on start suite");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("on finish suite");
		driver.close();	
	}
//	*********************************ITestListener*********************************
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	
//	*********************************IReporter*********************************
	
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		IReporter.super.generateReport(xmlSuites, suites, outputDirectory);
	}
	
	@Override
	public IReporterConfig getConfig() {
		// TODO Auto-generated method stub
		return IReporter.super.getConfig();
	}
	
//	*********************************GETTERS AND SETTERS*********************************
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		TestBaseClass.driver = driver;
	}
	
	
	
	
	
	
	
	
	
	


}
