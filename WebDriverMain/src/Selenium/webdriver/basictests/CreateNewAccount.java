package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		Thread.sleep(7000);
		
    	driver.findElement(By.name("firstname")).sendKeys("first");
    	
    	driver.findElement(By.name("lastname")).sendKeys("last");
    	
    	driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
    	
    	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
    	
    	driver.findElement(By.name("reg_passwd__")).sendKeys("Abcdef@123");
    	
    	driver.findElement(By.name("birthday_day")).sendKeys("23");
    	
    	driver.findElement(By.name("birthday_month")).sendKeys("Feb");
    	
    	driver.findElement(By.name("birthday_year")).sendKeys("2000");
    	
    	driver.findElement(By.name("sex")).click();
    	
    	driver.findElement(By.name("websubmit")).click();
    	
    	driver.close();
    	
    	
    	
    	
	}

}
