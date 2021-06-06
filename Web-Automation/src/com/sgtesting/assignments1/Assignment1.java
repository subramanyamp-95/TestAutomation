package com.sgtesting.assignments1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1 {
	
	static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
        launchBrowser();
        navigate();
        login();
        minimizeFlyOutWindow();
        createUser();
        deleteUser();
        logout();
        closeApplication();
	}

	
	static void launchBrowser()
	{
		String path=null;
		
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Assign1");
			oBrowser.findElement(By.name("lastName")).sendKeys("ment1");
			oBrowser.findElement(By.name("email")).sendKeys("assign1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("assignment1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			//By default Selenium does not handle the JavaScript alert because
			//By default Selenium WebDriver object has control on the current session of the browser, 
			//if any alerts opened on top of this browser then selenium can not able to identify them by default. 
			//In order to handle alerts , the driver object should switch to alert it can be achived by using the following code
			Alert oAlert=oBrowser.switchTo().alert();//retruns Alert object,by using Alert object
			String content=oAlert.getText();//this method retrives/fetches the text available in the alert
			System.out.println(content);
			oAlert.accept();//this method performs click operation on "OK" button
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
			oBrowser.findElement(By.linkText("Logout")).click();//it executes speed compare to browser
			Thread.sleep(2000);//after executing above stmnt this stmnt pause the test script 2sec in these 2secs browser will perform above stmnt
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
