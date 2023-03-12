package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPages;

public class LoginTest {
  WebDriver driver;
  LoginPages lp;
  
  @BeforeMethod
  public void  Getpage() {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("file:///C:/Users/shubh/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
    lp = new LoginPages(driver);
  }
	
	@Test
	public void VerifyTitleOfNextPage() {
		lp.LoginToApplication();
	Assert.assertEquals("JavaByKiran | Dashboard",driver.getTitle());
	}
	

	@Test
	public void VerifyErrorLogin() {
		lp.LoginError();
		WebElement Message = driver.findElement(By.id("email_error"));
//	Assert.assertEquals(Message.getText(),"Please enter email as kiran@gmail.com");
		Assert.assertTrue(Message.isDisplayed());
	}

}

