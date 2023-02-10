package WebDriverHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZipFileDownload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://testingmasters.com/student-corner/downloads/");
		
		driver.findElement(By.xpath("//a[@href='http://testingmasters.com/wp-content/uploads/Manual-And-Selenium-FRESHERS.zip']")).click();
		
		driver.quit();
		
		
		
		
	}

}
