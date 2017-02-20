package com.whiteqa.com;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class alerts {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.rightstart.com/"); //simple alerts
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("close-button")));
element.click();
Thread.sleep(5000);
		/*driver.get("file:///H:/Users/Hanshika/Desktop/alerts.html");
		driver.findElement(By.id("alertId")).click();*/
		
		
		/*Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.sendKeys("this is prompt");//prompt alerts
		Thread.sleep(5000);
		simpleAlert.accept();*/
		
		/*Confirmation alert
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		Thread.sleep(5000);
		simpleAlert.accept();*/
		
		
		
	}

}
