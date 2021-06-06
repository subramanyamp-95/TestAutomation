package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTestScript2 {
	
	 static WebDriver oBrowser=null;
	

	public static void main(String[] args) {
		
        launchBrowser();
        //launchBrowser1();
        navigate();
        
        login();
        minimizeFlyOutWindow();
        
        closeApplication();
	}
	
	static  void launchBrowser()
	{
		try
		{
			String path=null;
			path=System.getProperty("user.dir");
			//Usually selenium does not interact with browsers directly , 
			//it requires additional driver server to explore the object model of the browser so for each browser 
			//we have to download the respectiver driver server.
			//for ChromeBrowser we have to set the Proeprty in terms of Variable and path of executeable driver.
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe" );
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void launchBrowser1()
	{
		oBrowser=new ChromeDriver();
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			WebDriverWait wait=new WebDriverWait(oBrowser,30);
			wait.until(ExpectedConditions.attributeToBe(By.id("username"),"id","username"));
			wait.until(ExpectedConditions.attributeToBe(By.id("keepLoggedInLabel"), "id", "keepLoggedInLabel"));
			wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='loginButton']/div"), "Login"));
			//wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='keepLoggedInLabel']"), "Keep me logged in"));
			wait.until(ExpectedConditions.attributeToBe(By.id("headerContainer"), "id", "headerContainer"));
	        //wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='logoContainer']/div[1]/img"), "/img/default/login/timer.png?hash=1388610907"));
			
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
			oBrowser.findElement(By.name("remember")).click();
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			WebDriverWait wait=new WebDriverWait(oBrowser, 30);
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
	
	
	

}
