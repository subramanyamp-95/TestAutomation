package com.sgtesting.logs;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("The Steps in Assignments3 are");

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			log.info("Launching The Browser");
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("The Windows will Maximize here");
			oBrowser.manage().window().maximize();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{

		try {
			log.info("The URL of the application will  navigate here");
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			log.info("Login Will takes place");
			log.info("Enter The Username and password");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			log.info("minimizing the FlyOutWindow");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createCustomer()
	{
		try
		{
			log.info("Creating Customer with valid information");
			log.info("Click on the New Button");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Google");

			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
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
			log.info("Deleting the  created customer");
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			log.info("Logout From the application");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			log.info("Closing The application");
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
