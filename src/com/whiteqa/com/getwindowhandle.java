package com.whiteqa.com;

import java.util.Set;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.jna.platform.unix.X11.Window;

public class getwindowhandle {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://whiteboxqa.com");	
		
      driver.findElement(By.id("loginButton")).click();
        
   
 String currentWindowName =driver.getWindowHandle();

 
 Set<String> windows =driver.getWindowHandles();
 System.out.println("count of windows::"+windows.size());
 for (String win: windows){
	 if(!win.equals(currentWindowName)){
		 driver.switchTo().window(win);
		 System.out.println("hi");
	 }
 }
Thread.sleep(5000);
 driver.findElement(By.name("uname")).sendKeys("test123");
 driver.findElement(By.name("pwd")).sendKeys("password123");
 driver.findElement(By.id("login")).submit();
 
      
        driver.close();
	}

}
