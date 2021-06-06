package com.sgtesting.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {
	public static WebDriver getbrowser=null;
	@Test(priority=1)
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
			getbrowser = new ChromeDriver();
			getbrowser.manage().window().maximize();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	static void navigate()
	{
		try
		{
			getbrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void login()
	{
		try
		{
			getbrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(1000);
			getbrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void  minimizeFlyOutWindow()
	{
		try
		{
			getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void createUser()
	{
	
		try
		{
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content users']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("scott");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("king");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("scott123@gmail.com");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='username']")).sendKeys("Scott123");
			getbrowser.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("12getgo");
			getbrowser.findElement(By.xpath("//input[@type='password'and@name='passwordCopy']")).sendKeys("12getgo");
			getbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void modifyUser()
	{
		try
		{
			getbrowser.navigate().refresh();Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();Thread.sleep(2000);	
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("scottnew");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")	).sendKeys("kingnew");
			getbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void deleteUser()
	{
		try
		{
			getbrowser.navigate().refresh();
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);				
			getbrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=8)
	static void logout()
	{
		try
		{
			getbrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void closeBrowser()
	{
		try
		{	
			getbrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
