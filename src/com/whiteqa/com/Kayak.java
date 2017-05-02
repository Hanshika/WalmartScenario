package com.whiteqa.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kayak {
	WebDriver driver;
	@BeforeClass

	public void BeforeFunction(){


		driver = new FirefoxDriver();
		driver.get("https://www.kayak.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#footerSiteDescription  a[href='/flights']")).click(); //Flight Links
	}
	@Test
	public void FlightPage() throws InterruptedException{

		//driver.findElement(By.xpath("input[contains(@id,'-dialog-close/svg')]")).click(); //popup window
		driver.findElement(By.cssSelector("div[class$='displayCatBlock'] label[title*='One-way']")).click();// one way tab
		WebElement from=driver.findElement(By.cssSelector("div.inputWrapper  input[id$='-origin']"));
		from.clear();
		from.sendKeys("SCK");

		WebElement nearby=driver.findElement(By.cssSelector("label[id$='nearbyOriginCheckRtow-label']"));

		nearby.click();
		WebElement to=driver.findElement(By.cssSelector("div.airportBlock  input[id$='-destination']"));
		to.sendKeys("PDK");

		driver.findElement(By.cssSelector("label[id$='nearbyDestinationCheckRtow-label']")).click();
		driver.findElement(By.cssSelector("div.col-depart-date   span[id$='-travelDates-start-placeholder']")).click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		List<WebElement> allDates=driver.findElements(By.cssSelector(".r9-datepicker-item.r9-datepicker-enabled"));
		for(WebElement eles:allDates)
		{

			String date=eles.getText();
			//	System.out.println(date);

			if(date.equalsIgnoreCase("16"))
			{
				eles.click();
				break;
			}

		}

		driver.findElement(By.cssSelector("div[class$='col-field col-travelers']  div.label")).click(); //1 adult 1 economy
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.cssSelector("div.cabinRow  select[id$='-cabinType-select']")));

		dropdown.selectByValue("b"); //choose cabins
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("div[id$='-travelers-seniors']  button[class$='incrementor']")).click(); // incrementor button
		//Thread.sleep(6000);
		driver.findElement(By.cssSelector("div.searchFormWrapper button[id$='-submit']")).click(); 
		// search button
		String Parent_Window  =driver.getWindowHandle();
		//switching from parent window to child window  
		for (String Child_Window : driver.getWindowHandles())  
		{  
			driver.switchTo().window(Child_Window);  

		}
		driver.switchTo().window(Parent_Window);
		System.out.println(driver.getTitle());
		Assert.assertEquals("SCK to PDK, 5/16", driver.getTitle());
		Select dropdown1 = new Select(driver.findElement(By.cssSelector("select[id$='-sorting-select']")));
		dropdown1.selectByValue("price_b");
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void AfterFunction(){
		driver.quit();
	}
}











/*driver.findElement(By.cssSelector("div.col-return-date  span[id$='-travelDates-end-placeholder']")).click();
Thread.sleep(6000);
List<WebElement> date=driver.findElements(By.cssSelector(".r9-datepicker-item.r9-datepicker-enabled>span"));
Thread.sleep(6000);
for(WebElement elem:date)
{

	String com=elem.getText();
	System.out.println(com);

	if(com.equalsIgnoreCase("17"))
	{

		elem.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		break;
	}

}*/
