package com.sgtesting.pomassignments;

//4). lanchBrowser --> navigate --> login --> createCustomer --> modifyCustomer --> deleteCustomer --> logout --> closeApplication


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
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

			oPage.getCusName().sendKeys("Wipro");
			oPage.getDesName().sendKeys("Bangalore");

			oPage.getCommitBtn().click();
			Thread.sleep(4000);
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
	static void modifyCustomer()
	{
		try
		{

			oPage.getModifyCustomer().click();
			Thread.sleep(2000);

			oPage.getModifyCustomer1().sendKeys(" Chennai Hyderabad");
			Thread.sleep(2000);

			oPage.getModifyCustomer2().click();
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


