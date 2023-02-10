package ChromeDevTool;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools=driver.maybeGetDevTools().get();
//		devTools.createSession();
		// Send command to CDP methods->it will invoke and access to chrome dev tools

		//	                 ONE METHOD
//		devTools.send(
//				Emulation.setDeviceMetricsOverride(600, 1000,50,w true, Optional.<Number>empty(), Optional.<Integer>empty(),
//						Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Integer>empty(),
//						Optional.<Boolean>empty(), Optional.<ScreenOrientation>empty(), Optional.<Viewport>empty()));

		//		             SECOND METHOD 
		Map<String, Object> deviceMetrics=new HashMap<String, Object>();
		deviceMetrics.put("width",600);
		deviceMetrics.put("height",1000);
		deviceMetrics.put("mobile",true);
		deviceMetrics.put("deviceScaleFactor",50);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("navbar-toggler")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[routerlink='/library']")).click();
		driver.close();
	}

}
