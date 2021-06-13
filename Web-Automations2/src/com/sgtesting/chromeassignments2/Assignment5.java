package com.sgtesting.chromeassignments2;

//5). lanchBrowser --> navigate --> login --> createCustomer --> createProject --> deleteProject --> deleteCustomer --> logout --> closeApplication

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		createProject();
	    deleteProject();
	    deleteCustomer();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automations\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
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

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void flyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createCustomer()
	{
		try
		{

			oPage.getCreateCustomer().click();
			Thread.sleep(2000);

			oPage.getAddCustomer().click();
			Thread.sleep(4000);
			
			oPage.getSelCustomer().click();
			Thread.sleep(4000);
			
			oPage.getCusName().sendKeys("demo");
			oPage.getDesName().sendKeys("DemoSGTesting");

			oPage.getCommitBtn().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{

			oPage.getCreateProject().click();
			Thread.sleep(2000);

			oPage.getCreateProject1().click();
			Thread.sleep(4000);
			
			oPage. getCreateProject2().click();
			Thread.sleep(4000);
			
			oPage.getCreateProject3().sendKeys("demoProject");
			
			oPage.getCreateProject4().click();
			Thread.sleep(4000);
			
			oPage.getCreateProject5().click();
			Thread.sleep(4000);
			
			oPage.getCreateProject6().sendKeys("DemoSGTestingProject");

			oPage.getCreateProject7().click();
			Thread.sleep(5000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{

			oPage. getDeleteProject().click();
			Thread.sleep(2000);

			oPage. getDeleteProject1().click();
			Thread.sleep(4000);
			
			oPage. getDeleteProject2().click();
			Thread.sleep(4000);
			
			oPage. getDeleteProject3().click();
			Thread.sleep(4000);
			
			oPage. getDeleteProject4().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{

			oPage.getDeleteCustomer().click();
			Thread.sleep(2000);

			oPage.getDeleteCustomer1().click();
			Thread.sleep(4000);
			
			oPage.getDeleteCustomer2().click();
			Thread.sleep(4000);
			
			oPage.getDeleteCustomer3().click();
			Thread.sleep(4000);
			
			oPage.getDelCusName().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	

	static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
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

