package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		 
		driver.findElement(By.name("submit")).click();
		
		String exp_title= "Login: Mercury Tours";
		
		String act_title= driver.getTitle(); // return the title of the page
		//System.out.println(act_title);
		 
		if(exp_title.equals(act_title)== true);
		{
			System.out.println("system is passed");
		}
		{ 
			System.out.println("system is failed");
		}
		
		driver.close();
		

	}

}
