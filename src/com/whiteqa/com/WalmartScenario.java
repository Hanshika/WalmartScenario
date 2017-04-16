///// Scenario - add two item in the cart and finally assert for cart page.///////////


package com.whiteqa.com;
import java.util.List;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WalmartScenario {
	
	WebDriver driver;
	@BeforeClass
	public void BeforePage(){
		 driver= new FirefoxDriver();
			
			driver.get("https://www.walmart.com/");
	}
	
	@Test
	
	public void SearchFirstItem()
	{
	        driver.findElement(By.cssSelector("input#global-search-input ")).sendKeys("laptop");
			driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
		
			List<WebElement> results = driver.findElements(By.cssSelector("a[class^='product-title-link line-clamp line-clamp-3']"));
			
			for(WebElement element: results){
            String resultTitle = element.getAttribute("aria-label");
			System.out.println(resultTitle);
			if(!resultTitle.toUpperCase().contains("Acer Aspire ES1-533-C3VD 15.6 Laptop, Windows 10 Home, Intel Celeron N3350 Processor, 4GB RAM, 500GB Hard Drive")){
					element.click();
					break;
				}
				 
				}
		
		
			driver.findElement(By.cssSelector("button[class='prod-ProductCTA--primary btn btn-primary btn-block']  *:nth-child(2)")).click();
			List<WebElement> ele=driver.findElements(By.cssSelector("button[class='btn btn-inverse btn-block'] "));
			for(WebElement elem :ele){
				if(elem.getText().equalsIgnoreCase("Continue Shopping")){
					elem.click();
					break;
				}
			}
	}
				@Test
				public void SearchSecondItem()
				{
				 driver.findElement(By.cssSelector("input#global-search-input ")).sendKeys("tablets");
				 driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();	
				 List<WebElement> results1 = driver.findElements(By.cssSelector("a[class^='product-title-link line-clamp line-clamp-3']"));		
				 for(WebElement element: results1){

						String resultTitle1 = element.getAttribute("aria-label");
						System.out.println(resultTitle1);
						
						if(!resultTitle1.toUpperCase().contains("RCA Voyager 7 16GB Tablet Android 6.0 (Marshmallow)")){
							element.click();
							break;
						}
						 
						}
				 ////////////////////////////////////////////////////////////////////////////////////////
				 driver.findElement(By.cssSelector("button[class='prod-ProductCTA--primary btn btn-primary btn-block']  *:nth-child(2)")).click();
				 List<WebElement> ele1=driver.findElements(By.cssSelector("button[class='btn btn-inverse btn-block'] "));
					for(WebElement elems :ele1){
						if(elems.getText().equalsIgnoreCase("View Cart")){
							elems.click();
							break;
						}
				 
			}
				}	
				@Test
				public void CartPage()
				{
		WebElement el= driver.findElement(By.cssSelector("h3[class^='cart-list-title display-inline-block access-title']  *:nth-child(2)"));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(el.getText());
	    Assert.assertEquals("2 items.",el.getText());
		
				      
				}	
	
				@AfterClass
				public void ClosePage()
				{
					driver.close();
				}

				}


