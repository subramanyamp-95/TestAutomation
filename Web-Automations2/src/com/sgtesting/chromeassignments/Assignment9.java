package com.sgtesting.chromeassignments;

//1. LaunchBrowser--> navigate --> login as admin--> Create 3 users those are a) user1 b) user2 c)user3 --> Logout -->login as user1 
//--> Logout --> login as user2 --> logout -->login as user3 --> logout --> login as admin --> delete a) user1 b) user2 c)user3 --> 
//logout --> close application

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		create3Users();
		logout();
		loginandlogoutuser1();
		loginandlogoutuser2();
		loginandlogoutuser3();
		loginAdmin();   
		deleteUser();
		deleteUser();
		deleteUser();
		logout(); 
		closebrowser();

	}
	public static WebDriver getbrowser=null;
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automations\\Library\\drivers\\chromedriver.exe");
			getbrowser=new ChromeDriver();
			getbrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void navigate()
	{
		try
		{
			
			getbrowser.navigate().to("http://localhost:82/user/submit_tt.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAdmin()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("admin");
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));
			pwd.sendKeys("manager");
			Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")); 
			login.click();
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
			getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void create3Users()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();   //creating user 1
			Thread.sleep(1000);
			
			fname=getbrowser.findElement(By.name("firstName"));		
			fname.sendKeys("user1");
			
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.sendKeys("demo1");
			
			email=getbrowser.findElement(By.name("email"));			
			email.sendKeys("user1@mail.com");                                           
			
			uname=getbrowser.findElement(By.name("username"));		
			uname.sendKeys("user1");
			
			pwd=getbrowser.findElement(By.name("password"));		
			pwd.sendKeys("password1");
			
			repwd=getbrowser.findElement(By.name("passwordCopy"));	
			repwd.sendKeys("password1");
			
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")); 
			create.click();
			Thread.sleep(2000);
			
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));  //creating user 2
			add.click();
			Thread.sleep(1000);
			
			fname=getbrowser.findElement(By.name("firstName"));		
			fname.sendKeys("user2");
			
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.sendKeys("demo2");
			
			email=getbrowser.findElement(By.name("email"));			
			email.sendKeys("user2@mail.com");           
			
			uname=getbrowser.findElement(By.name("username"));		
			uname.sendKeys("user2");
			
			pwd=getbrowser.findElement(By.name("password"));		
			pwd.sendKeys("password2");
			
			repwd=getbrowser.findElement(By.name("passwordCopy"));	
			repwd.sendKeys("password2");
			
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));
			create.click();
			Thread.sleep(2000);
			
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));  //creating user 3
			add.click();
			Thread.sleep(1000);
			
			fname=getbrowser.findElement(By.name("firstName"));		
			fname.sendKeys("user3");
			
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.sendKeys("demo3");
			
			email=getbrowser.findElement(By.name("email"));			
			email.sendKeys("user3@mail.com");                                             
			
			uname=getbrowser.findElement(By.name("username"));		
			uname.sendKeys("user3");
			
			pwd=getbrowser.findElement(By.name("password"));		
			pwd.sendKeys("password3");
			
			repwd=getbrowser.findElement(By.name("passwordCopy"));	
			repwd.sendKeys("password3");
			
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	
			create.click();
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
			logout=getbrowser.findElement(By.linkText("Logout"));	//logout
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser1()  //creating loginandlogoutuser1
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		
			uname.sendKeys("user1");	
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));		
			pwd.sendKeys("password1");	
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		
			login.click();	
			Thread.sleep(2000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  
			Thread.sleep(2000);
			
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click(); 
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser2() //creating loginandlogoutuser2
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user2");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));
			pwd.sendKeys("password2");
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));	
			login.click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click(); 
			Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser3() //creating loginandlogoutuser3
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user3");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));
			pwd.sendKeys("password3");	
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			login.click();
			Thread.sleep(2000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click(); 
			Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser() //deleting users
	{
		try
		{	

			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
		
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1500);
			
			Alert check=getbrowser.switchTo().alert();	
			check.accept();
			Thread.sleep(2000);
			
			getbrowser.navigate().refresh();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closebrowser()
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
