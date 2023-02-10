package Log4j;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Log4jExample {

	public static void main(String[] args) {

		// Here we need to create logger instance so we need to pass Class name
		// for
		Logger logger =Logger.getLogger("Log4jExample");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.drivr", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		logger.warn("browser opened");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		logger.info("Clicked on register");
		driver.findElement(By.linkText("REGISTER")).click();
		
		logger.info("Entering contact information");
		
		driver.findElement(By.name("firstName")).sendKeys("Prachi");
		driver.findElement(By.name("lastName")).sendKeys("Burde");
		driver.findElement(By.name("phone")).sendKeys("7028353209");
		driver.findElement(By.name("userName")).sendKeys("prachi23@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Mahajanawadi,Hingna road Nagpur");
		driver.findElement(By.name("city")).sendKeys("Nagpur");
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		driver.findElement(By.name("postalCode")).sendKeys("441110");
		
		Select dropcountry=new Select(driver.findElement(By.name("country")));
		dropcountry.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("prachi23");
		driver.findElement(By.name("password")).sendKeys("23022000");
		driver.findElement(By.name("confirmPassword")).sendKeys("23022000");

		logger.info("Clicking on submit button");
		driver.findElement(By.name("submit")).click();
		
		logger.info("Validation started");
		if (driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Your registered successfully- TEST PASSED");
		}
		else
		{
			System.out.println("Your registration failed- TEST FAILED");
			logger.info("validation done");
		}
		
		logger.info("Exit Test");
		
		driver.quit();
		
		
		
	}

}
