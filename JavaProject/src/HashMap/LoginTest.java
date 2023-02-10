package HashMap;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	   static HashMap<String,String> logindata()
	   {
		   HashMap <String,String> hm =new HashMap <String,String>();
		   hm.put("x", "mercury@mercry");
		   hm.put("y", "mercury1@mercury1");
		   hm.put("z", "mercury2,mercury2");
		return hm;
		
		    }
	   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivr", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		// Login as x
		
		String credentials=logindata().get("z");
		
		String arr[]=credentials.split("@");  // mercury mercury
		
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		
		driver.findElement(By.name("submit")).click();
		
		//Validation
		if(driver.getTitle().equals("Welcome: Mercury Tours"))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		
		driver.close();
		
		
	}

}
