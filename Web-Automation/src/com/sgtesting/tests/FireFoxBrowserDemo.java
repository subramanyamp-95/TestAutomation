package com.sgtesting.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFoxBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		
		closeApplication();
		 
		//navigateUrl();
	}
	
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\Drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigateUrl()
	{
		try
		{
		  oBrowser.get("http://localhost:81/login.do");
		  WebDriverWait wait=new WebDriverWait(oBrowser,30);
		 // wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='username']"), "username"));
		  wait.until(ExpectedConditions.attributeToBe(By.name("pwd"), "name", "pwd"));
			wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
		oBrowser.quit();
		}catch(Exception e )
		{
			e.printStackTrace();
		}
	}

}
