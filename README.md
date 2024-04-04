# TrustRevised
Summary
This repository contains the tests for techChallenge of web application, these tests are developed using Selenium, POM, Maven, TestNG, Extent report

Getting Started
Run all tests:
> mvn clean test

> **Extended HTML report**:/TrustTestAutomation/TrustwalletTestReport.html

Test Framework Code Guidelines
> **TEST CLASSE**
These classes are written in **com.Trust.android.Tests** files. They should be easily readable and should just contain Trust wallet scenarios.
> 
> **TEST PAGE OBJECT CLASS**
A Page Class/Object is an object-oriented class that serves as an representation of a page in your application. The test class then use the methods of these page classes whenever they need to interact with the UI of that screen. The benefit is that if the UI changes, the tests themselves don’t need to change, only the code within the Page Class. Subsequently all changes to support the new UI are located in one place.
These classes are written in **com.Trust.android.PageObjects** files. They should be easily readable and should just contain Trust wallet Page Objects.
> 
> **TEST LOCATORS CLASS**
These classes are written in **com.Trust.apps.Locators** files. They should be easily readable and should just contain Trust wallet element locators.
> 
> **TEST ANDROID UTILS CLASS**
These classes are written in **com.Trust.apps.utils** files. They should be easily readable and should just contain Trust wallet navigation utils.

> **FUNCTIONAL XML FILE**
Location: src/test/Resourcess/FunctionalityTest.xml

> **POM FILE**
Location: TrustTestAutomation/pom.xml

> **SAMPLE SUMMARY REPORT**

<img width="957" alt="image" src="https://github.com/saurabh234kumar/TrustRevised/assets/74293017/dc45de82-7427-4fb0-b420-3715ab64c051">

> **PLUGINS DETAILS**
<dependencies>

		<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
		<dependency>
			<groupId>io.appium</groupId>
			<artifactId>java-client</artifactId>
			<version>8.6.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.19.1</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.9.0</version>
			<scope>test</scope>
		</dependency>
		
		<!--  Extent -->
		<dependency>
			<groupId>com.relevantcodes</groupId>
			<artifactId>extentreports</artifactId>
			<version>2.41.1</version>
		</dependency>
		
		<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>extentreports</artifactId>
			<version>3.1.5</version>
		</dependency>


  
>**Future enhancement**
Screenshot creation and email generation from POM file
