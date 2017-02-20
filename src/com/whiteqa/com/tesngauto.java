package com.whiteqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tesngauto {
	
	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", LOCATION+"\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

     
		driver.get("http://whiteboxqa.com");
		driver.getTitle();
	  
	  
	  
  }
}
