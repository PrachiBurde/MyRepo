package WebDriverHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[@href='#Tabbed']")).click();
		
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		
//		System.out.println(driver.getTitle()); // for verification
		
		Set <String> s=driver.getWindowHandles();
		
		for (String i:s)
		{
			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			
			
			if(t.contains("Selenium"))
			{
				driver.close();
			}
				
		}
		
		
		
		
	}

}
