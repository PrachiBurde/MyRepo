package WebDriverHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebHandlingRegistrationForm {

	  public static void main(String[] args) { 
		  
		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pratik");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Burde");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Mahajawadi, Hingna, road Nagpur");
		
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("pratik95@gmail.com");
		
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
//   	WebElement drptime=driver.findElement(By.xpath("//div[@id='msdd']"));
//		Select t= new Select(drptime);
//		t.selectByVisibleText("English");
		
		
		
		
	}

}
