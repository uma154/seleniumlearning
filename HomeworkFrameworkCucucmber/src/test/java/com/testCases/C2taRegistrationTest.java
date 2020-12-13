package com.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.C2taRegistration;

public class C2taRegistrationTest extends Library{
	/*@BeforeTest
	public void stratUp() {
		browserSetUp();
		logger.info("**Browser has been launched****");	
	}*/
	@Test
	public void login() {
		 C2taRegistration lpage=new  C2taRegistration(driver);
		lpage.loginToApp_regmenu();
		lpage.loginToApp_username(properties.getProperty("username"));
		lpage.loginToApp_email(properties.getProperty("email"));
		lpage.loginToApp_password(properties.getProperty("password"));
		lpage.loginToApp_regbutton();
		logger.info("**Login Successful****");
		
		
		
	}
}