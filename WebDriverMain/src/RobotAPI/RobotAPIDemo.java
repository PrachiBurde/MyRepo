package RobotAPI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAPIDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://spreadsheetpage.com/calendar/yearly/");
		
		driver.findElement(By.xpath("//a[@href='https://spreadsheetpage.com/calendar/yearly/?wpdmdl=2220&refresh=637e34ded82e61669215454']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}

}
