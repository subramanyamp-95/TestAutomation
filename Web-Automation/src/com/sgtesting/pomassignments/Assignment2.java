package com.sgtesting.pomassignments;

import org.openqa.selenium.Alert;

//2). lanchBrowser --> navigate --> login --> createUser --> modifyUser --> deleteUser --> logout --> closeApplication


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
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
			oBrowser.get("http://localhost:81/login.do");
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
			Thread.sleep(4000);
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

	static void createUser()
	{
		try
		{

			oPage.getCreateUser().click();
			Thread.sleep(2000);

			oPage.getAddUser().click();
			Thread.sleep(4000);

			oPage.getFirstName().sendKeys("demo");
			oPage.getLastName().sendKeys("User");
			oPage.getEmail().sendKeys("demo@gmail.com");
			oPage.getUserNa().sendKeys("userdemo");
			oPage.getPassd().sendKeys("manager");
			oPage.getPasswordC().sendKeys("manager");

			oPage.commit().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{

			oPage.delete1().click();
			Thread.sleep(5000);
			
			oPage.deletebtn().click();
			Thread.sleep(5000);
			
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			oPage.getModifyUser().click();
			Thread.sleep(2000);

			oPage.getModifyUser1().sendKeys("TESTING");
			
			oPage.getModifyUser2().click();
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

