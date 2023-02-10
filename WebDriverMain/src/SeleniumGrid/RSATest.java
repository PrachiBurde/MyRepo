package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {
		
		@Test
		public void HomePageCheck() throws MalformedURLException
		{
			DesiredCapabilities caps =new DesiredCapabilities();
//			caps.setBrowserName("firefox");
			caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			
			WebDriver driver=new RemoteWebDriver(new URL("http://192.168.101.7:4444"),caps);
			driver.get("https://rahulshettyacademy.com");
			System.out.println(driver.getTitle());
			driver.close();
		}
}
