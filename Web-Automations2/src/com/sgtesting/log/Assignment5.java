package com.sgtesting.log;

import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment5 {

	public static Logger log=Logger.getLogger("Assignments5 Acti Time Successfully Executed");
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



	@Test(priority=8)
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
	public void createCustomer()
	{
		try
		{
			log.info("customer has been created with all the required information");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			
			log.info("customerLightBox_nameField");
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("demo");
			
			log.info("customerLightBox_descriptionField");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("DemoSGTesting");
			
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=7)
	public void deleteCustomer()
	{
		try
		{
			log.info("delete customer");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			log.info("customer has been deleted successfully");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void createProject()
	{
		try
		{
			log.info("project has been created with all the required information");
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
	
	@Test(priority=6)
	public void deleteProject()
	{
		try
		{
			log.info("delete project");
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitBtn")).click();
			log.info("project has been deleted successfully");
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

