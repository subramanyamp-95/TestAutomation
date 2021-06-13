package com.sgtesting.chromeassignments;

//2. LaunchBrowser--> navigate --> login as admin --> create user1 --> logout --> login as user1 --> create user2 --> logout --> 
//login as user2 --> create user3 --> logout-->login as admin --> modify user1 --> logout --> login as user1 --> modify user2 --> logout 
//-->login as user2 --> modify user3 --> logout -->login as user2 --> delete user3 --> logout --> login as user1 --> delete user2 --> logout -->
//login as admin --> delete user1 --> logout --> close application


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) {
	    launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		
		createUser1();	 // creating users
		logout();	
		loginuser1();
		createUser2();	
		logout();	
		loginuser2();
		createUser3();	
		logout();
	
	   loginAdmin();	// modifying users			
		modifyUser1();	
		logout();	
	loginModifieduser1();	
		modifyUser2();
		logout();
		loginModifieduser2();	
		modifyUser3();	
		logout();
	
		loginModifieduser2();	//	deleting user
		deleteuser3();	
		logout();
		loginModifieduser1();
       deleteuser2();	
        logout();
		loginAdmin();		
		deleteuser1();	
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
			Thread.sleep(1000);
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
	static void createUser1()
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
	static void logout()
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
	static void loginuser1()
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
	static void createUser2()
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
	static void loginuser2()
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
	static void createUser3()

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
	static void modifyUser1()
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
	static void loginModifieduser1()
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
	static void modifyUser2()
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
	static void loginModifieduser2()
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
	static void modifyUser3()
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
	static void loginModifieduser3()
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
	static void deleteuser3()
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
	static void deleteuser2()
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
	static void deleteuser1()
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


