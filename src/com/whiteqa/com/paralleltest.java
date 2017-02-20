package com.whiteqa.com;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import javafx.scene.control.RadioButton;
public class paralleltest {
  @Test
  public void function1() {
	  System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
         
        driver.findElement(By.className("_58mt")).click();
  		System.out.println("radio button was clicked");
  		
  Select dr=new Select(driver.findElement(By.id("month")));
  dr.selectByValue("1");
  Select dr1=new Select(driver.findElement(By.id("day")));
  dr1.selectByValue("3");
  Select dr2=new Select(driver.findElement(By.id("year")));
  dr2.selectByValue("2016");
	}
  
  
  @Test
  public void function2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement radiobutton= driver.findElement(By.className("_58mt"));
		boolean sex =radiobutton.isSelected();
		if(sex == false)
		{
			Thread.sleep(5000);
			radiobutton.click();
		
			System.out.println("Test has selected radio button");
	
		}else {
			System.out.println("radio button is not selected");
			Thread.sleep(5000);
			driver.quit();
		}
	}
  }


