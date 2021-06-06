package com.sgtesting.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment9 extends Prerequisite {
	
public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;

	@Test(priority=1)
	static void runPrerequisite()
	{
		Prerequisite.launchBrowserandNavigate();
		Prerequisite.loginAdmin();
		Prerequisite.minimizeFlyOutWindow();
		try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void createUser1()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 1
			add=getbrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]"));	add.click();Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user1");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last1");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user1@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password1");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password1");
			create=getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));	create.click();
			Thread.sleep(1500);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void loginuser1()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void createUser2()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 2
			add=getbrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]"));	add.click();Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user2");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last2");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user2@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password2");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password2");
			create=getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));	create.click();
			Thread.sleep(1500);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginuser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void createUser3()

	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 3
			add=getbrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]"));	add.click();Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user3");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last3");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user3@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user3");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password3");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password3");
			create=getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));	create.click();
			Thread.sleep(1500);
			postrequisite.logout();Thread.sleep(1500);
			Prerequisite.loginAdmin();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void modifyUser1()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]")).click(); Thread.sleep(1500);
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	fname.sendKeys("user1new"); Thread.sleep(1000);
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	lname.sendKeys("last1new");	Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user1new");  Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click(); 
			Thread.sleep(1000);
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=8)
	static void loginModifieduser1()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1new");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void modifyUser2()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]")).click(); Thread.sleep(1500);
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	fname.sendKeys("user2new"); Thread.sleep(1000);
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	lname.sendKeys("last2new");	Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user2new");  Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click(); 
			Thread.sleep(1000);
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=10)
	static void loginModifieduser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2new");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id='loginButton']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();  Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void modifyUser3()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]")).click(); Thread.sleep(1500);
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	fname.sendKeys("user3new"); Thread.sleep(1000);
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	lname.sendKeys("last3new");	Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user3new");  Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click(); 
			Thread.sleep(1000);
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=12)
	static void deleteuser3()
	{
		try
		{
			Assignment9.loginModifieduser2();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]")).click(); 
			Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();	Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	static void deleteuser2()
	{
		try
		{
			Assignment9.loginModifieduser1();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]")).click(); 
			Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();	Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	static void deleteuser1()
	{
		try
		{
			Prerequisite.loginAdmin();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();	Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15 )
	static void postrequistes()
	{
		try
		{
			postrequisite.logout();Thread.sleep(1000);
			postrequisite.closeBrowser();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
