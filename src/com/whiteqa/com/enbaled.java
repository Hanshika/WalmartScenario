package com.whiteqa.com;

import javafx.scene.control.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enbaled {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		/*WebElement buttonid =driver.findElement(By.id("u_0_e"));
		boolean signup= buttonid.isDisplayed();
		  Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.id("u_0_1"));
		
		WebElement lastname=driver.findElement(By.id("u_0_3"));*/
		
		
		WebElement radiobutton= driver.findElement(By.className("_58mt"));
		boolean sex =radiobutton.isSelected();
		if(sex == true)
		{
			radiobutton.click();
		
			System.out.println("Test has selected radio button");
	
		}else {
			System.out.println("radio button is not selected");
		}
	}
}
		  //Verify Last name text box is enabled or not and then print related message.
		  /*if(lastname.isDisplayed())
		  {
		   System.out.print("\nText box Last name is enabled. Take your action.");
		  }
		  else
		  {
		   System.out.print("\nText box Last name is disabled. Take your action.");
		  }*/
		  
	
	

