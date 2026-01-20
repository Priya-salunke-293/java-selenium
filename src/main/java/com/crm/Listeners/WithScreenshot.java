package com.crm.Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.crm.javaUtility.GenerateDateAndTime;

import BaseClass.HomePageBase;

public class WithScreenshot extends HomePageBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+ " is OnTestStart", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name +" is OnTestSuccess", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+ " is OnTestFailure", true);
		String dynamicName = GenerateDateAndTime.nameWithDateAndTime(name);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File(".\\src\\test\\resources\\Screenshots"+dynamicName+".png");
		try {
			FileHandler .copy(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name +" is OnTestSkipped", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("OnStart", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("OnFinish", true);
	}

}
