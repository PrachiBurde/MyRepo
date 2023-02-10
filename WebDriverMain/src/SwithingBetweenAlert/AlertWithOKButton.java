package SwithingBetweenAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// Alert box with OK button
		
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		driver.findElement(By.xpath("//div[@id='OKTab']")).click();
		
//		Switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // OK button click and close.
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
