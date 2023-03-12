package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LoginObjectRepo.LoginObjectRepo;

public class LoginPages extends LoginObjectRepo {
  WebDriver driver;

  // it is optinals;
  /**
 @FindBy(id="email")
 public WebElement Email;
 
 @FindBy(id="password")
 public WebElement Password;
 
 @FindBy(xpath="//button")
 public WebElement Button;
 **/
  
 
	public LoginPages(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void LoginToApplication() {
		Email.sendKeys("kiran@gmail.com");
		Password.sendKeys("123456");
		Button.click();
	}

	public void LoginError() {
		Email.sendKeys("Amol@gmail.com");
		Password.sendKeys("123456");
		Button.click();
	}
	
	
	
	
	
}
