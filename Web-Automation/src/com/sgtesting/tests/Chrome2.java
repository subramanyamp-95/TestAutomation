package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome2 {
	
	WebDriver oBrowser3=null;
	

	public static void main(String[] args) {
		
		Chrome2 obj=new Chrome2();
		obj.launchBrowser3();
		obj.navigate3();
		
	}
	 
	void launchBrowser3()
	{
		String path=null;

		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			System.out.println(path);
			oBrowser3 =new ChromeDriver();
            
		}catch(Exception e)
		{

			e.printStackTrace();
		}

	}
	void navigate3()
	{
		try	
		{
			oBrowser3.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
