package com.whiteqa.com;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class seleniummethods {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "H://Users//Hanshika//gomathy_java//Seleniumtestmethods//geckodriver.exe");
WebDriver driver= new FirefoxDriver();
	//methods to call selenium apis
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();	
driver.manage().window().maximize();
driver.getWindowHandle();
driver.getWindowHandles();
driver.close();
driver.quit();
driver.switchTo().window("window name");
driver.switchTo().frame("id");//iframes can use index,name,id//driver will switch to that frame

driver.manage().deleteAllCookies();
driver.getCurrentUrl();
driver.getPageSource();
driver.getTitle();
driver.manage().getCookies();

Actions action =new Actions(driver);
WebElement element =driver.findElement(By.id("name"));
action.doubleClick(element).build().perform();

Actions action1 =new Actions(driver);
WebElement element1 =driver.findElement(By.id("name"));
action1.contextClick(element1).build().perform();

WebElement source  =  driver.findElement(By.id("Source ElementID"));
WebElement destination  =  driver.findElement(By.id("Taget ElementID"));

Actions action2 =new Actions(driver);
action2.dragAndDrop(source, destination).build().perform();//mousehover element

List<WebElement> element2 =driver.findElements(By.id("name"));
File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile, new File("D:\\testScreenShot.jpg"));

Select dropdown =new Select(driver.findElement(By.id("countries")));
dropdown.selectByVisibleText("india");
dropdown.selectByindex(2);
dropdown.selectByValue("india");

//Anything to check which option 

System.out.println(driver.findElement(By.id("India")).isSelected());

System.out.println(driver.findElement(By.id("India")).isDisplayed());
System.out.println(driver.findElement(By.id("India")).isEnabled());
boolean sex =radiobutton.isSelected();
boolean sex =radiobutton.isDisplayed();
boolean sex =radiobutton.isEnabled();


WebElement element4 = driver.findElement(By.id("textBoxLocator"));//it used to find the one web element. It return only one WebElement type.
List<WebElement> elements =element.findElements(By.id("textBoxLocator"));// it used to find more than one web element. It return List of WebElements.

//Robot API
Robot robot = new Robot();

//Simulate enter key action
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyPress(KeyEvent.VK_UP);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_TAB);

// HTTPS and ssl Untrusted connection
FirefoxProfile profile = new FirefoxProfile();
profile.setAcceptUntrustedCertificates(true); 
profile.setAssumeUntrustedCertificateIssuer(false);
WebDriver driver = new FirefoxDriver(profile); 


//drag and drop
Actions act = new Actions(driver);
WebElement source = driver.findElement(By.xpath(“ -----”)); //source ele which you want to drag
WebElement target = driver.findElement(By.xpath(“ -----”)); //target where you want to drop
 act.dragAndDrop(source,target).perform();
 
  JavascriptExecutor js = (JavascriptExecutor)driver;//JavascriptExecutor
 driver.get("https://www.amazon.com/");
 
 js.executeScript("window.scrollBy(0,1000)");
 
 // Alerts
 Alert alerts =driver.switchTo().alert();
 alerts.accept();
 alerts.dismiss();
 alerts.getText();
 alerts.sendKeys("hi");
  //page factory
/* @FindBy annotaion and .initElements() method to inatalize all the page objects
 PageFactory.initElements(driver, this);*/
 
 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicitly waits
WebDriverWait wait =new WebDriverWait(driver,10);//Explicitly waits
WebElement Elements=wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
Wait wait = new FluentWait(driver)
.withTimeout(20, SECONDS)// maximum timeout for 20   ------Fluent wait---------
.pollingEvery(5, SECONDS)// each 5 seconds interval checks elements presence or not
.ignoring(NoSuchElementException.class);//ignoring throw exception



}
}