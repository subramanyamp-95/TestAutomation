package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
      public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		launchBrowser();
	navigate();

	}
	static void launchBrowser()
	{
	    //ChromeBrowserDemo obj=new ChromeBrowserDemo();
		String path =null;
		try
		{
			
			
			path=System.getProperty("user.dir");//it will get the user directry
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
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
			//ChromeBrowserDemo obj=new ChromeBrowserDemo();
			oBrowser.get("http://localhost:81/login.do");//to navigate the link
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}   

}
