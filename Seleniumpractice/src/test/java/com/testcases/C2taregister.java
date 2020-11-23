package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2taregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://c2ta.co.in/");
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.id("reg_username")).sendKeys("Umab");
		driver.findElement(By.name("reg_email")).sendKeys("chikki4illu@gmail.com");
		driver.findElement(By.name("reg_password")).sendKeys("Sweethome@1357");
		driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();
		
		
		
		
	}

}
