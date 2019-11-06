package com.crm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\sachi\\eclipse-workspace\\crm\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} 
		catch (FileNotFoundException e)
		{
			System.out.println("file not found");
		}
	}
	
	public void initilization()
	{
		if (driver== null)
		{
			if(prop.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				driver= new ChromeDriver();
			}
			
			else if(prop.getProperty("browser").equals("firefox")) {
				System.out.println("load ff driver");
				
			}
				
		}
		
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("baseurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	


}
