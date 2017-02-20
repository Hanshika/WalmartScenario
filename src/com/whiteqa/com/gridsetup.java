package com.whiteqa.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class gridsetup {

	WebDriver driver;
	@BeforeClass
	public void function () throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://vinodh:3456/wd/hub"), capabilities);
		
	}
	@Test
	public void texttpye() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		Thread.sleep(5000);
		//driver.findElement(By.id("_fZl")).click();
		System.out.println("Title of page:::" +driver.getTitle());
	}
	@AfterClass
	public void stop(){
		driver.quit();
	}
}
