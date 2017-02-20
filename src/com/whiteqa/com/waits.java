package com.whiteqa.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;



public class waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.yelp.com/");
		
		/*driver.findElement(By.linkText("About Me")).click();
		WebElement element=	driver.findElement(By.linkText("About Me"));
		System.out.println(element.getText());*/
		
		WebElement element =driver.findElement(By.id("find_desc"));
		element.sendKeys("pizz");
		
		List<WebElement> options = driver.findElements(By.xpath(".//*[@class='suggestions-list']/li"));
	for(WebElement ele :options){
		if(ele.getText().equalsIgnoreCase("pizza restaurants")){
			ele.click();
			break;
		}
	} 
	}
}
	


