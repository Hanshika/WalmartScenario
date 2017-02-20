	package com.whiteqa.com;
import static org.testng.AssertJUnit.assertEquals;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Firstautomation {
	
	
		public static void main(String[] args) throws InterruptedException {
			
					System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//chromedriver.exe");
					WebDriver driver= new ChromeDriver();
					driver.get("https://www.facebook.com/");
					//driver.findElement(By.id("loginButton")).click();
					
				
					 
				WebElement element= driver.findElement(By.id("email"));
			    element.sendKeys("gomathy.vinodh@gmail.com");
				      driver.findElement(By.id("pass")).sendKeys("hanshika18");
				  /* 	WebElement checkbox= driver.findElement(By.id("persist_box"));
				   	checkbox.click();
				       System.out.println(checkbox.isSelected());*/
					 driver.findElement(By.id("loginbutton")).click();
						Thread.sleep(7000);
					 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.findElement(By.id("findFriendsNav")).click();
		
				
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 System.out.println("current of page is :"+driver.getCurrentUrl());
			//	 System.out.println("source of page is :"+driver.getPageSource());
				 System.out.println("get title  is :"+driver.getTitle());
				 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElement(By.cssSelector("div#userNavigationLabel")).click();
				 //driver.findElement(By.xpath(".//h2[text()='No New Friend Requests']")).isDisplayed();
				// System.out.println("No New Friend Requests"+driver.getTitle());
		//	List<WebElement> log=driver.findElements(By.xpath("//span[@class='_54nh']/form"));
				 
			 driver.findElement(By.xpath(".//a[@href='/friends/requests/?fcref=tn&outgoing=1']")).click();
			Thread.sleep(7000);
			// System.out.println("current of page is :"+driver.getCurrentUrl());
			// System.out.println("get title  is :"+driver.getTitle()); 
			//boolean signup= element.isDisplayed();
			WebElement logOut = driver.findElement(By.id("userNavigationLabel"));
			logOut.click();
			WebElement signOut = driver.findElement(By.name("Log Out"));
			logOut.click();
			System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
			String pagetitle = driver.getTitle();
			System.out.println(pagetitle);	 
			}
				

		

	}



