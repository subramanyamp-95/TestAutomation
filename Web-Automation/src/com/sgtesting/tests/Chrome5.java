package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome5 {
	
	static WebDriver oMozi=null;

	public static void main(String[] args) {
		
       // launchBrowser();
	}
   
	static void launchBrowser()
	{
		String path=null;
		try
		{
			
			path=System.getProperty("user.dir");//it will get path upto current project where we are working
			//System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe" );
			//System.setProperty("webdriver.chrome.driver", "F:\\DemoWorkSpace\\Web-Automation"+"\\Library\\Drivers\\chromedriver.exe");
			//System.out.println(path);
		     oMozi=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
