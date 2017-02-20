package com.whiteqa.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://demo.tutorialzine.com/2009/09/shopping-cart-php-jquery/demo.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement from =driver.findElement(By.xpath(".//*[@src='img/products/iPod.png']"));
		
		WebElement to =driver.findElement(By.id("cart-icon"));
		
		 Actions action1 = new Actions(driver);
		 
	   //action1 .dragAndDrop(from, to).perform();
		 action1.clickAndHold(from).moveToElement(to).release(to).build().perform();
		 
		 action1.contextClick().perform(); //right click on mouse in web page
		 Thread.sleep(2000);
		
	 System.out.println( driver.findElement(By.xpath(".//*[@id='item-list']")).isDisplayed());
	    
		
		
	}

}
