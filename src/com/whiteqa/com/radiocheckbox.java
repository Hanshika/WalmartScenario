package com.whiteqa.com;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class radiocheckbox {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		/*driver.findElement(By.className("_58mt")).click();
		System.out.println("radio button was clicked");
		
Select dr=new Select(driver.findElement(By.id("month")));
dr.selectByValue("1");
Select dr1=new Select(driver.findElement(By.id("day")));
dr1.selectByValue("3");
Select dr2=new Select(driver.findElement(By.id("year")));
dr2.selectByValue("2016");*/
		
		 driver.manage().window().setSize(new Dimension(400,500));
		 System.out.println("Window height Is -> "+driver.manage().window().getSize().getHeight());
		  System.out.println("Window width Is -> "+driver.manage().window().getSize().getWidth());
		  System.out.println("Window x Is ->" +driver.manage().window().getPosition().getX());
	System.out.println("Window y Is ->" +driver.manage().window().getPosition().getY());
	Thread.sleep(5000);
	driver.navigate().to("http://www.rightstart.com/");
	driver.close();
	System.out.println("hi i am here");
	}

}
