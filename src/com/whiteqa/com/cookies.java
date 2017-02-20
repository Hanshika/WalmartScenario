package com.whiteqa.com;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		
		//get cookies
/*	Set<Cookie> cookies =	driver.manage().getCookies();
	for(Cookie cook:cookies){
		System.out.println("cookies::"+cook.getName());
	}*/
//add cookies
	
	Cookie name = new Cookie("mycookie", "123456789123");
	driver.manage().addCookie(name);
	Set<Cookie> cookies =	driver.manage().getCookies();
	for(Cookie cook :cookies){
	System.out.println("Cookies:::"+cook.getName());
	
	driver.manage().deleteCookieNamed("mycookie");

	
	}
		
	
	
	}

}
