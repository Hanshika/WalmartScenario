package com.whiteqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title of the page "+ driver.getTitle());
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("gomathy.vinodh@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("hanshika18");
		WebElement Signup_button = driver.findElement(By.id("loginbutton"));
		Signup_button.click();
		Thread.sleep(5000);
		System.out.println("After login title is = " + driver.getTitle());
		WebElement logOut = driver.findElement(By.id("userNavigationLabel"));
		logOut.click();
		Thread.sleep(5000);
		WebElement signOut = driver.findElement(By.name("Log Out"));
		logOut.click();

		System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		}

}
