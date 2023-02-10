import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countRowsColumn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
		WebElement table=driver.findElement(By.cssSelector("table[class='table-display'] "));
		System.out.println(table.findElements(By.tagName("tr")).size()); // no. of column
		
		System.out.println(table.findElements(By.tagName("th")).size());		
        List<WebElement> secondrow=(table.findElements(By.tagName("tr")).get(2)
        		.findElements(By.tagName("td")));	
	
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
		driver.close();
	}

}
