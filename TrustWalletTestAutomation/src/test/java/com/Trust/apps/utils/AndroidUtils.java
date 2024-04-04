package com.Trust.apps.utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Trust.apps.Locators.AndroidLocators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AndroidUtils {

	static AppiumDriver driver;
	private static Logger testLogger = LogManager.getLogger(Logger.class.getName());

	public AndroidUtils(AppiumDriver driver) {
		AndroidUtils.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	/*-------------> The code below belongs to Test Methods<---------------------  */	
	
	public void Wait(int Seconds) {
		int miliseconds;
		try {
			miliseconds = Seconds * 1000;
			Thread.sleep(miliseconds);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException Ex) {
			return false;
		}
	}
	
	public void scroll(String down) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", down);
		js.executeScript("mobile: scroll", scrollObject);

	}

	public void scrollUp(String up) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", up);
		js.executeScript("mobile: scroll", scrollObject);

	}

	public void scrollleft(String left) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", left);
		js.executeScript("mobile: scroll", scrollObject);

	}

	public void scrollright(String right) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", right);
		js.executeScript("mobile: scroll", scrollObject);

	}
	


}
