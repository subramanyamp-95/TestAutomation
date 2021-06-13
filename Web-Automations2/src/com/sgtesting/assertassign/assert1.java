package com.sgtesting.assertassign;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert1 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("actitime testing");

	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automations\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("the chrome browser has been launched");
			oBrowser.manage().window().maximize();

			log.info("the chrome browser window has been maximised");
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
			oBrowser.get("http://localhost:82/login.do");
			String s1=oBrowser.getTitle();
			System.out.println(s1);
			Assert.assertEquals(s1,"actiTIME - Login");
			System.out.println("the website has been navigated to");
			log.info("navigated to the actitime software");
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
			
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");

			String s=oBrowser.findElement(By.id("username")).getText();
			System.out.println(s);
			Assert.assertEquals(oBrowser.findElement(By.id("username")).getText(),s);
			System.out.println("username entered");
			//Thread.sleep(6000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");

			String s1=oBrowser.findElement(By.name("pwd")).getText();
			Assert.assertEquals(oBrowser.findElement(By.name("pwd")).getText(),s1);
			System.out.println("password  entered");
			
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			String s2=oBrowser.findElement(By.xpath("//div[text()='Login ']")).getText();
			Assert.assertEquals(oBrowser.findElement(By.xpath("//div[text()='Login ']")).getText(),s2);
			System.out.println("admin logged in");
			Thread.sleep(10000);
			
			log.info("logged into the actitime software");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(6000);

			log.info("minimise the flyout window");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=6)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			String s2=oBrowser.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(oBrowser.findElement(By.linkText("Logout")).getText(),s2);
			System.out.println("logged out of the application");
			Thread.sleep(2000);
			log.info("logged out of the application successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=7)
	public void closeApplication()
	{

		try
		{
			oBrowser.close();

			String s2=oBrowser.getTitle();
			System.out.println(s2);
			Assert.assertEquals(oBrowser.getTitle(),s2);
			System.out.println("closed the browser successfully");
			log.info("closed the browser successfully");

			log.info("---------------------------------------");
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
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();

			String s=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).getText();
			System.out.println(s);
			Assert.assertEquals(oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).getText(),s);
			System.out.println("user creation initiated");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("username")).sendKeys("user11");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);

			log.info("created the user successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

			log.info("deleted the user successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	

}
