package com.Trust.android.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.Trust.android.PageObjects.Guest;


import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class TC_ClickGetStarted extends BaseClass {

	Guest confirm;


	@Test(alwaysRun=true, priority=1)
	public void TC_GetStarted() throws IOException, InterruptedException{
		// creates a toggle for the given test, adds all log events under it    
		logger = extent.createTest("TestCase Verify Get Started button", "to validate get started page");
		System.out.println("Test Started TC_ContinueAsGuest");
		confirm = new Guest(driver); 
		Assert.assertTrue(confirm.ClickGetStarted());
		logger.pass("Clicked Getstarted button");
		
	}

	@Test(alwaysRun=true, priority=2)
	public void TC_HomeMenu() throws IOException, InterruptedException{
		// creates a toggle for the given test, adds all log events under it    
		logger = extent.createTest("TestCase Verify home menu button", "to validate home menu button");
		System.out.println("Test Started TC_HomeMenu");
		confirm = new Guest(driver); 
		Assert.assertTrue(confirm.ClickHomeSwapMenu());
		logger.pass("Clicked home menu button");
		
	}
}
