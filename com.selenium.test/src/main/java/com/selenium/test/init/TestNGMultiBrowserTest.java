/*package com.selenium.test.init;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class TestNGMultiBrowserTest {
	
	public WebDriver driver;
	WebDriverWait wait;
	Logger Log=Logger.getLogger("TestNGMultiBrowserTest");      
     // configure log4j properties file
     //PropertyConfigurator.

  @Test
  public void accountTest() {
	  Log.info("Account Test stated in :" + Thread.currentThread().getId());	
	  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='My Account']"))).click();
	  String pageHeading =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='entry-title']"))).getText();
	  Assert.assertEquals("Your Account", pageHeading);
  }
  
  @Test
  public void loginTest() {
	  Log.info("Login Test stated in :" + Thread.currentThread().getId());		  
	  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='My Account']"))).click();
	  String pageHeading =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='entry-title']"))).getText();
	  WebElement username = driver.findElement(By.cssSelector("input[name='log']"));
	  WebElement password = driver.findElement(By.cssSelector("input[name='pwd']"));
	  Assert.assertNotNull(username);
	  Assert.assertNotNull(password);
  }
  
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String browser) {
	  
	  driver = SetupWebdriver.getWebdriver(browser);
	  driver.get("http://store.demoqa.com/");
	  wait = new WebDriverWait(driver,30);
	  PropertyConfigurator.configure("log4j.properties");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
*/