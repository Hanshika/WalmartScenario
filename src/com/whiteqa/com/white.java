package com.whiteqa.com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class white {
	
	@Test
	public void function() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("wblhead")).click();
		Thread.sleep(5000);
		 System.out.println("get title  is :"+driver.getTitle());
		//driver.switchTo().defaultContent();
		//String url=driver.getCurrentUrl();
//	Assert.assertEquals(url,"http://whitebox-learning.com/");
}
}