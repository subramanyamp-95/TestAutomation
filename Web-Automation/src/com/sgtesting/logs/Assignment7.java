package com.sgtesting.logs;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("The Steps in Assignments7 are");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		login();
		 minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		//logout();
		//closeApplication();
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
	
	static void createProject()
	{
		try
		{
			log.info("Creating Project with valid information");
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createTask()
	{
		try
		{
			log.info("Creating task with valid information");
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("task1");
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input")).sendKeys("Task2");
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void deleteTask()
	{
		try
		{
			log.info("Deleting Project with valid information");
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.className("deleteButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
			Thread.sleep(2000);
			
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