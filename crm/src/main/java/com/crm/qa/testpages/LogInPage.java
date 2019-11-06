package com.crm.qa.testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.testbase.TestBase;

public class LogInPage extends TestBase{

	
	@FindBy(xpath = "//input[@name='email']") WebElement email;
	@FindBy(name = "password") WebElement pwd;
	@FindBy(xpath = "//div[contains(@class , 'ui fluid large blue submit button')]") WebElement loginPageBtn;
	@FindBy(xpath = "//span[text () = 'Log In']") WebElement LoginBtnHomePage;
	

	public LogInPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public void login(String email1, String pwd1)
	{	
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement we = wait.until(ExpectedConditions.visibilityOf(LoginBtnHomePage));
		
		LoginBtnHomePage.click();*/
		System.out.println("try to find email id");
		email.sendKeys(email1);
		pwd.sendKeys(pwd1);
		loginPageBtn.click();
		
	}
	

}
