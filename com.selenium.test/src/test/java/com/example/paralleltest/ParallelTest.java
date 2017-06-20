package com.example.paralleltest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.test.init.ConfigureWebDriver;

public class ParallelTest {
	
 WebDriver driver;
	
 @Test
 @Parameters("browserName")
 public void testGoogle(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
 }
  @Test
  @Parameters("browserName")
  public void testYahoo(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
  }
  
  @Test
  @Parameters("browserName")
  public void testFaceBook(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
  }
  
  @Test
  @Parameters("browserName")
  public void testGmail(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
  }
  
  @Test
  @Parameters("browserName")
  public void testYahooMail(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
  }
  
  @Test
  @Parameters("browserName")
  public void testSeleniumEasy(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
  }
  @Test
  @Parameters("browserName")
  public void testLearnAutomation(String browserName) {
	  
	driver = ConfigureWebDriver.getWebdriver(browserName);
	driver.get("http://www.gppgle.com");
	  
  }
}
