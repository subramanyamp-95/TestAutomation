package com.sgtesting.xpathdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//	absoluteXPath();
		//1	relativeXPathUsingTagNameAlone();
		//2	relativeXPathUsingTagNameWithIndex();

		//4	relativeXPathUsingAttributeNameValueCombination();
		//5	relativeXPathUsingAttributeValueAlone();
		//6	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombination();
		//7	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingOROperator();
		//8	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingAndOperator();
		//relativeXPathUsingTextContent();
		//10	relativeXPathUsingPartialTextContent();
		relativeXPathUsingPartialAttributeValue();
		
		relativeXPathUsingAttributeNameValueCombinationWithTagNameIndex();
		
		relativeXPathUsingTagNameWithAttributeNameValueCombination();
		
		relativeXPathUsingAttributeNameValueCombinationWithTagName();
		
	//	relativeXPathUsingAttributeNameValueCombination();
		
		//12	relativeXPathUsingTagNameWithAttributeNameAlone();
		//	relativeXPathUsingTagNameWithAttributeNameAlone1();
		//relativeXPathUsingTagNameWithAttributeNameAlone2();
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

	static void relativeXPathUsingPartialAttributeValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[starts-with(@id,'username')]")).sendKeys("Admin");    //username

			oBrowser.findElement(By.xpath("//input[starts-with(@name,'pwd')]")).sendKeys("manager");     //password

			oBrowser.findElement(By.xpath("//a[starts-with(@id,'loginButton')]")).click();     //login

			oBrowser.findElement(By.xpath("//div[starts-with(@id,'gettingStartedShortcutsMenuCloseId')]")).click();   //minimizeFlyOutWindow()

			//  oBrowser.findElement(By.xpath("//a[contains(@class,'logout')]")).click();    //logout
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void relativeXPathUsingAttributeNameValueCombinationWithTagNameIndex()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void relativeXPathUsingTagNameWithAttributeNameValueCombination()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("demo");

			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("user");

			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys("demo@gmail.com");

			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser");

			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome1");

			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("Welcome1");

			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}

	static void relativeXPathUsingAttributeNameValueCombinationWithTagName()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);

			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingAttributeNameValueCombination()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}














