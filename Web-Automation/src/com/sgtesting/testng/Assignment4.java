package com.sgtesting.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4 {

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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	static void createCustomer()
	{
		try
		{
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Google");
			getbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	static void modifyCustomer()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(3000);				
			getbrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter customer description...']")).sendKeys("Customer-Descrption");
			Thread.sleep(3000);	
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div//div[@class='closeButton']")).click();
			Thread.sleep(3000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=7)
	static void deleteCustomer()
	{
		try
		{
		
			getbrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(3000);				
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(3000);

		}catch(Exception e)
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
