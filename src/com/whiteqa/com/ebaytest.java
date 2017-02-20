package com.whiteqa.com;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ebaytest {
WebDriver driver;

	@Test
	public void function1() throws InterruptedException {
	 driver = new ChromeDriver();
	driver.get("http://www.ebay.com/");
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a")));
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	
	Actions actions = new Actions(driver);
	actions.moveToElement(element).build().perform();
	WebElement subElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://www.ebay.com/rpp/jewelry']")));
	actions.moveToElement(subElement).click().perform();
	Assert.assertTrue(driver.findElement(By.id("gh-logo")).isDisplayed());
	}

}
