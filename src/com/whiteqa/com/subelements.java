package com.whiteqa.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class subelements {
	WebDriver driver;
	@BeforeClass
	public void beforeclass(){

		System.setProperty("webdriver.chrome.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//geckodriver.exe");
		
		driver= new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void actionclass()
	{
   WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement Mainelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a")));
					
		Actions action = new Actions(driver);
		
		action.moveToElement(Mainelement).perform();
		
	WebElement	subelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@title='Fashion - Beauty']")));
		
		action.moveToElement(subelement).click().build().perform();
		
		System.out.println("current title of page::"+driver.getTitle());
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
		
		}
		
	}


