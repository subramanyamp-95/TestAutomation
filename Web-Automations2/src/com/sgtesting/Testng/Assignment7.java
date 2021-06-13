package com.sgtesting.Testng;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment7 {
	public static WebDriver oBrowser=null;

	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automations\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("demo");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("DemoSGTesting");
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(500);
			
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("demoProject");
			
			oBrowser.findElement(By.xpath("//*[@id='ext-gen50']/td[2]/em")).click();
		
			oBrowser.findElement(By.xpath("//*[@id='ext-gen125']")).click();
			//oBrowser.findElement(By.xpath("//*[@id='projectPopup_newCustomerNameField']")).sendKeys("SGTESTING");
			oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("DemoSGTestingProject");
			
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public  void createTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("SGTESTING");
			oBrowser.findElement(By.id("createTasksPopup_commitBtn")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void deleteTasks()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
			//Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@Test(priority=9)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
	public void closeApplication()
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
