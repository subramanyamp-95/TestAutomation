package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {
	
	public WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();

	}
	
	static void launchBrowser()
	{
	    Chrome1 obj=new Chrome1();
		String path =null;
		try
		{
			
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
			obj.oBrowser=new ChromeDriver();
			obj.oBrowser.get("http://localhost:81/login.do");
			obj.oBrowser.manage().window().maximize();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
