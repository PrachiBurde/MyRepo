package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); // invoke the browser
		
		driver.get("https://demo.guru99.com/test/newtours/"); // open the URL in browser
				
		driver.findElement( By.name("userName")).sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click(); 
		
		driver.close();  // close the URL
		
	}
	
}


