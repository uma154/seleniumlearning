package com.testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.C2taLogin;
import com.reusableFunctions.SeleniumUtilities;

	public class C2taLoginTest extends Library{
		@BeforeTest
		public void stratUp() {
			browserSetUp();
			logger.info("**Browser has been launched****");	
		}
		@Test
		public void login() {
			C2taLogin lpage=new C2taLogin(driver);
			lpage.loginToApp_loginmenu();
			lpage.loginToApp_username(properties.getProperty("username"));
			lpage.loginToApp_password(properties.getProperty("password"));
			lpage.loginToApp_loginbutton();
			logger.info("**Login Successful****");
			
			
			
		}
		/*@AfterTest
		public void close() throws IOException {
			SeleniumUtilities selUtil=new SeleniumUtilities(driver);
			selUtil.to_take_screenshot("src/test/resources/ScreenShots/c2talogin.png");
			logger.info("**Took Screenshot****");*/
			
			
		
		

}
