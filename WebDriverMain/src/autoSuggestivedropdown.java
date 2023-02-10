import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestivedropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[class='inputs ui-autocomplete-input']"));
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		List<WebElement>options=driver.findElements(By.cssSelector(".ui-menu li"));
		
		for (WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
			}
		}
       
		driver.close();
	}

}
