package com.selenium.test.init;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ConfigureWebDriver {
	
	public static WebDriver getWebdriver(String browser) {
		
	WebDriver driver;
	
	DesiredCapabilities cap;
	
	switch(browser){
	
	case "chrome":
		ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Object> contentSettings = new HashMap<String, Object>();
        contentSettings.put("notifications", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-plugins");
        options.addArguments("--start-maximized");
		cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);
		return driver;
	case "internerExplorer":
		cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		driver = new InternetExplorerDriver(cap);
		return driver;
	default:
		return null;
		
	
	}
	
	
	/*if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\310251316\\Desktop\\Alzone\\Alzone Tax Track Soln\\WindowsFormsApplication1\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		return driver;
	}
	else if(browser.equals("ie")) {
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();		  
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);
		return driver;
	}
		else
		return null;*/
					
	}
	
	}


