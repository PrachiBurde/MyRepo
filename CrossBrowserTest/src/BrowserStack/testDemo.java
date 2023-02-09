package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testDemo {
	
	@Test
	public void titleCheck() throws MalformedURLException
	{
		MutableCapabilities capabilities=new MutableCapabilities();
	    WebDriver driver=new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),capabilities);
	    driver.get("https://rahulshettyacademy.com");
	    Assert.assertTrue(driver.getTitle().matches("Rahul Shetty Academy")); 
	}
}



