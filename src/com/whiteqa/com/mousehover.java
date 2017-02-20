package com.whiteqa.com;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class mousehover {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

       
		
		driver.get("http://whiteboxqa.com/");
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    WebElement element=driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[6]/a"));
	
	    Actions action = new Actions(driver);
	    action.moveToElement(element).build().perform();
	    driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[6]/ul/li[2]/a")).click();
	}

}
