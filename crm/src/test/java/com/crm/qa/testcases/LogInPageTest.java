package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.testbase.TestBase;
import com.crm.qa.testpages.LogInPage;

public class LogInPageTest extends TestBase{
	
	LogInPage logIn;
	
	
	public LogInPageTest() 
	{
		super();
		
	}

	@BeforeMethod 
	public void testSetUp()	{
		initilization();
		logIn = new LogInPage();
	}
	
	@Test
	public void logInTest()
	{
		String lg= prop.getProperty("username");
		String pw= prop.getProperty("pwd");
		System.out.println(lg+" "+ pw);
		logIn.login(prop.getProperty("username"), prop.getProperty("pwd"));
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
	}
	
	@AfterMethod
	public void tearDown()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
