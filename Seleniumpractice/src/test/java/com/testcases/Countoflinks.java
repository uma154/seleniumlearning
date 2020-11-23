package com.testcases;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Countoflinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		 int numberOfLinks =driver.findElements(By.tagName("a")).size();
		System.out.println("number of links on webpage:"+numberOfLinks);
		
		
	}

}
