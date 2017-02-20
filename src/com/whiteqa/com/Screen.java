package com.whiteqa.com;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.*;
//import com.sun.jna.platform.FileUtils;

public class Screen {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"H://Users//Hanshika//Downloads//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://whiteboxqa.com/");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		if(src.exists());
		try
		{

			FileUtils.copyFile(src, new File("C:/screen/error.png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}
}
