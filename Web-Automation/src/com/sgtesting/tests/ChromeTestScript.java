package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTestScript {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		//closeApplication();
	}
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			System.out.println(path);
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			WebDriverWait wait=new WebDriverWait(oBrowser, 60);//This method never assigns specified amount of time to a driver object instead It provides  expected conditions, 
			//if any GUI element appears within the speciifed amount of time then the execution continues with next line.
			//if the GUI element haven't occured within the speciifed amount of time then it provides
			//Exception (NoSuchElementFoundException) and it stops the execution.
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
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			WebDriverWait wait=new WebDriverWait(oBrowser, 60);
			wait.until(ExpectedConditions.textToBe(By.xpath("//td[text()='Enter Time-Track']"), "Enter Time-Track"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			//oBrowser.findElement(By.linkText("Logout")).click();
			oBrowser.findElement(By.id("logoutLink")).click();
			WebDriverWait wait=new WebDriverWait(oBrowser, 30);
			wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
