package com.whiteqa.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dollartree {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dollartree.com");

		System.out.println("Title of the page " + driver.getTitle());
	driver.findElement(By.xpath("//div[@class='closeBtn']")).click();

		Thread.sleep(5000);

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,15); WebElement element
		 * =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@class='closeBtn']"))); element.click();
		 */

		List<WebElement> elem = driver.findElements(By
				.cssSelector(".jsLoginLink"));
		for (WebElement s : elem) {
			if (s.getText().equalsIgnoreCase("Log In")) {
				s.click();
				break;

			}
		}
driver.switchTo().frame(0);
		WebElement username = driver.findElement(By.id("userN"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		username.sendKeys("gomathy.vinodh@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("Durgai23$");
		driver.findElement(By.id("signIn")).click();

		System.out.println("current Title of the page "
				+ driver.getCurrentUrl());
		
	}

}
