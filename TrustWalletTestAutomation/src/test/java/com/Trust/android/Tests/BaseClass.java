package com.Trust.android.Tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.appium.java_client.android.AndroidDriver;


public class BaseClass {
	
	AndroidDriver driver;//Creating appium driver
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite 
	public void setUpTest()
	{

		htmlReporter = new ExtentHtmlReporter("TrustwalletTestReport.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		 
        caps.setCapability("deviceName", "moto g(6)");
        caps.setCapability("udid", "ZF6222H8C5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appium: newCommandTimeout", 60); 
        /*The number of seconds the appium server should wait for clients
         * To send commands before deciding
         * that the client has gone away and the session should shut down 
         */
        
        caps.setCapability("platformVersion", "9");
        caps.setCapability("appPackage", "com.wallet.crypto.trustapp");
        caps.setCapability("appActivity", "com.wallet.crypto.trustapp.ui.app.AppActivity");
		
		  try {
	            driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), caps);
	       
	        } catch (MalformedURLException e) {
	            throw new RuntimeException("Appium server URL is invalid", e);
	        }

		
	}
	
	
	@AfterTest
	public void teardown() {
		
        if (driver != null) {
            driver.quit();
            driver = null;
        }
		
	}
	
	@AfterSuite
	public void flush()
	{
		extent.flush();
		
	}

}
