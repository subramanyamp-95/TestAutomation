package com.sgtesting.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment7 {
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
			Thread.sleep(2000);
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
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Google");
			getbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	static void createProject()
	{
		try
		{	
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(2000);			
			getbrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("New-Project");Thread.sleep(2000);	
			getbrowser.findElement(By.xpath("//div[@id='projectPopup_footer']//span[@class='buttonTitle']")).click();Thread.sleep(2000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=7)
	static void createTask()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='addNewTaskButtonContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(3000);
			getbrowser.findElement(By.xpath("//tr[1]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-1");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[2]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-2");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[3]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-3");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']//span[@class='buttonTitle']")).click();
			Thread.sleep(5000);


		}catch(Exception e)
		{

		}
	}
	@Test(priority=8)
	static void deleteTask()
	{
		try
		{
			getbrowser.navigate().refresh();
			for(int i=1;i<=3;i++)
			{
				getbrowser.findElement(By.xpath("//table[@class='taskRowsTable']//tr[1]//div[@class='title ellipsis']")).click();
				Thread.sleep(4000);		
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='actionButton']")).click();Thread.sleep(3000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();Thread.sleep(3000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//span[@id='taskPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(3000);
			}
		
		}catch(Exception e)
		{

		}
	}
	
	@Test(priority=9)
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
	@Test(priority=10)
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
