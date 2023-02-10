package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {

		System.setProperty("webdiver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.xpath("//div[@class='_6lux']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		
		if (email.isDisplayed() & email.isEnabled());
		{
			email.sendKeys("abc@gmail");
		}
		if (password.isDisplayed() & password.isEnabled());
		{
			password.sendKeys("Abcdef@123");
		}
//		System.out.println(driver.findElement(By.xpath("//input[@type='radio']")).isSelected());
	}

}
