package com.whiteqa.com;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptexeutor {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

      
       
       JavascriptExecutor js = (JavascriptExecutor)driver;
       driver.get("https://www.amazon.com/");
       
       js.executeScript("window.scrollBy(0,1000)");
       driver.close();

	}

}
