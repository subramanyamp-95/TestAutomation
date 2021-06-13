package com.sgtesting.log;

import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment2 {

	public static Logger log=Logger.getLogger("Assignments2 Acti Time Successfully Executed");
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info("successfully launched chrome browser");
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automations\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

			log.info("The window has been maximised");
			oBrowser.manage().window().maximize();

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void navigate()
	{
		try
		{
			log.info("actitime software has been navigated to");
			oBrowser.get("http://localhost:82/login.do");

			
			Thread.sleep(6000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@Test(priority=3)
	public void login()
	{
		try
		{
			//oBrowser.findElement(By.id("username")).sendKeys("admin");
			log.info("username entered");
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");

			
			//Thread.sleep(6000);
			log.info("password entered");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			
			log.info("logged in to the actitime software");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			
			Thread.sleep(10000);
			//System.out.println("logged in");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			log.info("the fluout window has been minimised");
			Thread.sleep(6000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	@Test(priority=6)
	public void closeApplication()
	{

		try
		{
			log.info("the chromebrowser has been closed");
			oBrowser.close();
			log.info("+++++++++++++++++++++++++++++++++++++++");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Reporter.getCurrentTestResult();
	}

	@Test(priority=4)
	public void createUser()
	{
		try
		{
			log.info("user has been created with all the required information");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(4000);
			
			log.info("enter firstname");
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			Thread.sleep(4000);
			
			log.info("enter lastname");
			oBrowser.findElement(By.name("lastName")).sendKeys("User");
			Thread.sleep(4000);
		
			log.info("enter email");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(4000);
			
			log.info("enter username");
			oBrowser.findElement(By.name("username")).sendKeys("user11");
			
			log.info("enter password");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=6)
	public void deleteUser()
	{
		try
		{
			log.info("delete user");
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			log.info("user has been deleted successfully");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void modifyUser()
	{
		try
		{
			log.info("user modify");
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("username")).sendKeys("Sai");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath( "//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			log.info("user has been modified successfully");
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

