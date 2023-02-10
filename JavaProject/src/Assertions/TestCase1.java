package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test

	public void loginTest() {
		
		System.setProperty("webdriver.chrome.drivr", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // lunching the browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.guru99.com/test/newtours/"); // open the url
		
		WebElement usernametxt=driver.findElement(By.name("userName"));
		WebElement passwordtxt=driver.findElement(By.name("password"));
		
		//This is to check whethertextbox is displayed or not
		//Test will only continue, if the below statment is ture
		
		/*Assert.assertTrue(usernametxt.isDisplayed());
		usernametxt.sendKeys("mercury");
		
		Assert.assertTrue(passwordtxt.isDisplayed());
		passwordtxt.sendKeys("mercury");*/
		
		Assert.assertFalse(usernametxt.isDisplayed());
		usernametxt.sendKeys("mercury");
		
		Assert.assertFalse(passwordtxt.isDisplayed());
		passwordtxt.sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		
		//Validation
		String ExpTitel="Login: Mercury Tours";
		
		Assert.assertEquals(ExpTitel, driver.getTitle()); // Compare both titels
		
		driver.close();
		
		
		
		

	}

}
