package com.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/practiceform");
		driver.findElement(By.id("button1")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		//storing the window in parent variable
		String parent = it.next();
			//storing the window in child variable
		String child = it.next();
			//print the title of the title------------still on the parent window
		System.out.println(driver.getTitle());
		
		// now swiching to child window
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		//switching to parent window
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
	}
}


