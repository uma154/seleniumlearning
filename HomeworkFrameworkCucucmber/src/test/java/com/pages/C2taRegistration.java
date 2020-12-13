package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C2taRegistration {
	
		

		WebDriver driver;
		By regmenu=By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[2]");
		By username=By.id("reg_username");
		By email=By.id("reg_email");
		By password=By.id("reg_password");
		
		By regbutton=By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button");
		
		public  C2taRegistration(WebDriver driver) {
			this.driver=driver;
			
		}
		public void loginToApp_regmenu() {
			driver.findElement(regmenu).click();
		}
		
		
		public void loginToApp_username(String userid) {
			driver.findElement(username).sendKeys(userid);
		}
		public void loginToApp_email(String userid) {
			driver.findElement(email).sendKeys(userid);
		}
		public void loginToApp_password(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		public void loginToApp_regbutton() {
			driver.findElement(regbutton).click();
		}

	



}

	


