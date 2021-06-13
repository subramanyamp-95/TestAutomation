package com.sgtesting.Testng;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment9 {
	public static WebDriver oBrowser=null;
	
	public static WebDriver getbrowser=null;
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;

	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automations\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void loginAdmin()
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void minimizeFlyOutWindow()
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
	
	@Test(priority=5)
	public void createUser1()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")); //creating user 1
			add.click();
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

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void logout1()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public void loginuser1()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user1");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password1");
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			login.click();
			Thread.sleep(2000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void createUser2()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			
			
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	//creating user 2
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

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public void logout2()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
	public void loginuser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user2");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password2");
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));login.click();
			Thread.sleep(2000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=11)
	public void createUser3()

	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	
			add.click();
			Thread.sleep(1000);//creating user 3
		
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
	
	
	@Test(priority=12)
	public void logout3()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=13)
	public void loginAdmin1()
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=14)
	public void modifyUser1()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click();
			Thread.sleep(1500);
			
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear();
			Thread.sleep(1000); 	
			fname.sendKeys("user1 demo1"); 
			Thread.sleep(1000);
			
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); 
			Thread.sleep(1000); 
			lname.sendKeys("demo1 demo1");
			Thread.sleep(1000);
			
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear(); 
			Thread.sleep(1000);	
			uname.sendKeys("user1 demo1"); 
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	@Test(priority=15)
	public void logout4()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=16)
	public void loginModifieduser1()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user1 demo1");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));
			pwd.sendKeys("password1");
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			login.click();
			Thread.sleep(1500);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=17)
	public void modifyUser2()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); 
			Thread.sleep(2000);
			
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear();
			Thread.sleep(1000); 	
			fname.sendKeys("user2 demo2"); 
			Thread.sleep(1000);
			
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); 
			Thread.sleep(1000); 
			lname.sendKeys("demo2 demo2");	
			Thread.sleep(1000);
			
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear(); 
			Thread.sleep(1000);	
			uname.sendKeys("user2 demo2");  
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
		}catch(Exception e)
		{

		}
	}
	
	
	
	@Test(priority=18)
	public void logout5()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=19)
	public void loginModifieduser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user2 demo2");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));
			pwd.sendKeys("password2");
			Thread.sleep(1000);
		
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			login.click();
			Thread.sleep(2000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=20)
	public void modifyUser3()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); 
			Thread.sleep(2000);
			
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	
			fname.sendKeys("user3 demo3");
			Thread.sleep(1000);
			
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	
			lname.sendKeys("demo3 demo3");	
			Thread.sleep(1000);
			
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	
			uname.sendKeys("user3 demo3"); 
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
		}catch(Exception e)
		{

		}
	}
	
	@Test(priority=21)
	public void logout6()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=22)
	public void loginModifieduser3()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		
			uname.sendKeys("user3 demo3");	
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));	
			pwd.sendKeys("password3");	
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		
			login.click();
			Thread.sleep(2000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=23)
	public void deleteuser3()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); 
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			
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
	
	@Test(priority=24)
	public void logout7()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=25)
	public void loginModifieduser11()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));
			uname.sendKeys("user1 demo1");
			Thread.sleep(1000);
			
			pwd=getbrowser.findElement(By.name("pwd"));
			pwd.sendKeys("password1");
			Thread.sleep(1000);
			
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			login.click();
			Thread.sleep(1500);
			
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@Test(priority=26)
	public void deleteuser2()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); 
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			
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
	
	
	
	@Test(priority=27)
	public void logout8()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=28)
	public void loginAdmin11()
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=29)
	public void deleteuser1()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1000);
			
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			
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
	
	
	
	@Test(priority=30)
	public void logout()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	
			logout.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=31)
	public void closebrowser()
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



	