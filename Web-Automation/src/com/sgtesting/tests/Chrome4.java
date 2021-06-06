package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome4 {
	
	//static WebDriver oMozi=null
  	 WebDriver oMozi=null;//instance member

	public static void main(String[] args) {
		
		launchBrowser();
	}
    
	
    static void launchBrowser()
	{
    	Chrome4 obj=new Chrome4();
    	String path =null;
		try
		{
			path=System.getProperty("user.dir");//it will get the user directry
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
			obj.oMozi=new ChromeDriver();
			//oMozi.get("https://www.youtube.com/");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
