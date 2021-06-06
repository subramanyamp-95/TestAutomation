package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTestScript3 {
	static WebDriver oBrowser =null;
	static WebDriverWait wait=null;

	public static void main(String[] args) {
		
       launchBrowser();
       navigate();
       login();
       minimizeFlyOutWindow();
       
       logOut();
	}
	
	static void launchBrowser()
	{
		try
		{
			String path=null;
			path=System.getProperty("user.dir");
			System.out.println(path);//F:\DemoWorkSpace\Web-Automation
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			
			
			oBrowser=new ChromeDriver();//lauching browser
			oBrowser.manage().window().maximize();//maximize window
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
			 wait=new WebDriverWait(oBrowser,60);
			wait.until(ExpectedConditions.attributeToBe(By.name("username"), "name", "username"));
			wait.until(ExpectedConditions.attributeToBe(By.name("pwd"), "name", "pwd"));
			
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
			wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"), "Enter Time-Track"));
			wait.until(ExpectedConditions.textToBe(By.xpath("\r\n" + 
					"//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]"), "Getting Started Shortcuts"));
			
			
		}catch(Exception e)
		{
		  e.printStackTrace();	
		}
	}
	
	static void  minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logOut()
	{
		try
		{
		  oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		  wait.until(ExpectedConditions.attributeToBe(By.id("username"),"id", "username"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
