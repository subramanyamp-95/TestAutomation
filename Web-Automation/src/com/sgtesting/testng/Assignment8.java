package com.sgtesting.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Assignment8 extends Prerequisite{
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;
	//public static WebDriver getbrowser=null;
	@Test(priority=1)
	static void runPrerequisite()
	{
		Prerequisite.launchBrowserandNavigate();
		Prerequisite.loginAdmin();
		Prerequisite.minimizeFlyOutWindow();
		
		try
		{
			Thread.sleep(6000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=2)
	static void create3Users()
	{	

		try
		{
			for(int i=1;i<=3;i++)  
			{
				getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(5000);
				add=getbrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[1]"));	add.click();Thread.sleep(5000);
				fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user"+i);
				lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last"+i);
				email=getbrowser.findElement(By.name("email"));			email.sendKeys("user"+ i+"@mail.com");
				uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user"+i);
				pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password"+i);
				repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password"+i);
				create=getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));	create.click();
				Thread.sleep(3000);
			
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void loginandlogoutuser1()
	{
		try
		{
			postrequisite.logout();Thread.sleep(4000);
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");		Thread.sleep(4000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(4000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(4000);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(4000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 	Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void loginandlogoutuser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");		Thread.sleep(4000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(4000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(4000);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(4000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginandlogoutuser3()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user3");		Thread.sleep(4000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password3");	Thread.sleep(4000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(4000);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(4000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6) 
	static void deleteUser()
	{
		try
		{	
			Prerequisite.loginAdmin();
			for(int i=1;i<=3;i++)
			{
				getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();		Thread.sleep(5000);
				getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]")).click(); 
				Thread.sleep(3500);
				getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();	Thread.sleep(5000);
				Alert check=getbrowser.switchTo().alert();	check.accept();	Thread.sleep(5000);
			
			}
			

			////*[@id="userListTableContainer"]/table/tbody/tr[1]- every time the row is shifted while deleting first in last out,
			//// therefore deleting the same row for every iteration.
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();
		
	}
}
