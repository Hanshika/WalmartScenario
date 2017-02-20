
package com.whiteqa.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class amazon {
	// String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver",
				"H://Users//Hanshika//gomathy_java//Seleniumtestmethods//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		// System.out.println("Title of the page " + driver.getTitle());
	}

	@Test
	public void HeaderNavLinks() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By
				.cssSelector(".nav-line-2"));
		Assert.assertEquals(5, elements.size());
	}

	@Test
	public void SiginFunction() throws InterruptedException {

		driver.findElement(By.id("nav-link-accountList")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,18);//Explicitly waits
		WebElement Elements=wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_email")));
		//WebElement username = driver.findElement(By.id("ap_email"));
		Elements.sendKeys("vinodh.e@gmail.com");
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("hanish26");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		 System.out.println(driver.getTitle());
	
	
	}

	@Test
	public void SearchFunction() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		// search page functionality

		driver.findElement(By.xpath("//*[@value='Go']")).click();

		Thread.sleep(7000);
		// System.out.println("current url" + driver.getCurrentUrl());
		/*Select dropdown = new Select(driver.findElement(By.id("sort")));
		dropdown.selectByValue("price-asc-rank");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		 System.out.println("current url" + driver.getTitle());
	}

	@Test
	public void GiftCardPageFunction() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]")).click();

		Thread.sleep(5000);
		List<WebElement> element1 = driver.findElements(By
				.cssSelector(".bxc-grid__image.bxc-grid__image--light"));
		Assert.assertEquals(6, element1.size());
		System.out.println("Title of the page " + driver.getTitle());
		//Assert.assertEquals("Gift Cards & Registry @ Amazon.com",driver.getTitle());
	}

	@AfterClass
	public void closedriver() {
		driver.quit();
	}

}
