package com.sgtesting.chromeassignments2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.chromeassignments2.ActiTimePage;

public class Assignment9 {
	public static ChromeDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginCreate();
		loginModify();
		deleteUser();
		//closeApplication();
		}
	static void launchBrowser()
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

	static void navigate()
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

	static void loginCreate()
	{
		try
		{
			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};
			for(int i=0;i<3;i++)
			{
				
				oPage.getUserName().sendKeys(s[i]);
				oPage.getPassword().sendKeys(a[i]);
				oPage.getLoginButton().click();
				Thread.sleep(7000);
				
				if (i==0)
				{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				}
				if(i>0)
				{

					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
					Thread.sleep(7000);
				}
				oPage.getCreateUser().click();
				Thread.sleep(2000);
				oPage.getAddUser().click();
				Thread.sleep(4000);
				
				oPage.getFirstName().sendKeys("demo1"+i);
				oPage.getLastName().sendKeys("User"+i);
				oPage.getEmail().sendKeys("demo"+i+"@gmail.com");
				oPage.getUserNa().sendKeys(s[i+1]);
				oPage.getPassd().sendKeys(a[i+1]);
				oPage.getPasswordC().sendKeys(a[i+1]);
				oPage.commit().click();
				Thread.sleep(5000);
				oPage.getLogoutLink().click();
				Thread.sleep(2000);

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginModify()
	{
		try
		{

			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};

			String b[]= {"//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]"};
			
			for(int i=0;i<3;i++)
			{
				oPage.getUserName().sendKeys(s[i]);
				oPage.getPassword().sendKeys(a[i]);
				oPage.getLoginButton().click();
				Thread.sleep(7000);
				
				if (i==0)
				{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				}
				

				oPage.getCreateUser().click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath(b[i])).click();
				Thread.sleep(7000);
				oPage.getLastName().sendKeys("DEMO111");
				Thread.sleep(5000);
				oPage.commit().click();
				Thread.sleep(3000);
				oPage.getLogoutLink().click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{

			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};
			String b[]= {"//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]"};
			for(int i=2;i>=0;i--)
			{
				oPage.getUserName().sendKeys(s[i]);
				oPage.getPassword().sendKeys(a[i]);
				oPage.getLoginButton().click();
				Thread.sleep(7000);
				
				if (i==0)
				{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				}
				oPage.getCreateUser().click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath(b[i])).click();
				Thread.sleep(5000);
				oPage.deletebtn().click();
				Thread.sleep(5000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				oPage.getLogoutLink().click();
				Thread.sleep(2000);
			}
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

