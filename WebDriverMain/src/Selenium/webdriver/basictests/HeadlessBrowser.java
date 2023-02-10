package Selenium.webdriver.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
//		options.setHeadless(true);
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.javatpoint.com/java-tutorial");
		 
		System.out.println("title of the page:"+driver.getTitle());
		
		
		
		
		
		

	

	
	

	
	}

}
