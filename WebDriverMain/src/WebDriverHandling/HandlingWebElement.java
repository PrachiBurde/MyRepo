package WebDriverHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jotform.com/build/223183698053461");
		
		driver.findElement(By.xpath("//input[@id='first_3']")).sendKeys("Prachi");
		driver.findElement(By.xpath("//input[@id='last_3']")).sendKeys("Burde");
		
		driver.findElement(By.xpath("//input[@id='input_5_full']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='input_4']")).sendKeys("prachi23@gmail.com");
		
		driver.findElement(By.xpath("//label[@id='label_input_8_0']")).click();
		driver.findElement(By.xpath("//label[@id='label_input_8_1']")).click();
		driver.findElement(By.xpath("//label[@id='label_input_8_3']")).click();
		driver.findElement(By.xpath("//label[@id='label_input_8_4']")).click();
		driver.findElement(By.xpath("//label[@id='label_input_8_5']")).click();
		driver.findElement(By.xpath("//label[@id='label_input_8_6']")).click();
		
		driver.findElement(By.xpath("//input[@id='input_10_addr_line1']")).sendKeys("Mahajawadi");
		driver.findElement(By.xpath("//input[@id='input_10_addr_line2']")).sendKeys("Hingna");
		driver.findElement(By.xpath("//input[@id='input_10_city']")).sendKeys("Nagpur");
		driver.findElement(By.xpath("//input[@id='input_10_state']")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//input[@id='input_10_postal']")).sendKeys("441110");
		
		driver.findElement(By.xpath("//textarea[@id='input_9']")).sendKeys("we'll need some basic information about you.");
		
		driver.findElement(By.xpath("//button[@id='input_2']")).click();
		
		driver.close();
		
		
	}

}
