package com.Trust.android.PageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Trust.apps.Locators.AndroidLocators;
import com.Trust.apps.utils.AndroidUtils;


import org.openqa.selenium.WebElement;


import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//public class Guest extends AndroidUtils
public class Guest extends AndroidUtils {

	AndroidUtils utils;

	@FindBy(xpath=AndroidLocators.GetStarted_XPath)
	WebElement GetStarted_XPath ;

	@FindBy(xpath = AndroidLocators.Home_XPath)
	WebElement Home_XPath;
	
	@FindBy(xpath = AndroidLocators.Swap_XPath)
	WebElement Swap_XPath;
	

	

	AndroidDriver driver;
	private static Logger testLogger = LogManager.getLogger(Logger.class.getName());


	public Guest(AndroidDriver driver) {
		//this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this); 
	}


	/*-------------> The code below belongs to Test Methods<---------------------  */	



	public boolean ClickGetStarted(){
		Wait(10);
		boolean flag=true;
		try{

			Thread.sleep(5000);

			if(GetStarted_XPath.isDisplayed()==true){
				testLogger.info("Fetching SignIn: "+GetStarted_XPath.getText());

				GetStarted_XPath.click();

			}
		}catch(Exception exp)
		{
			testLogger.error("Unable to click get started button"+exp.getCause());
			exp.printStackTrace();
		}
		return flag;	
	}
	
	
	public boolean ClickHomeSwapMenu(){
		
		Wait(10);
		boolean flag=true;
		try{

			if(Home_XPath.isDisplayed()==true){
				testLogger.info("Fetching SignIn: "+Home_XPath.getText());

				Home_XPath.click();
				Swap_XPath.click();

			}
		}catch(Exception exp)
		{
			testLogger.error("Unable to click home menu button"+exp.getCause());
			exp.printStackTrace();
		}
		return flag;	
	}


	
}
