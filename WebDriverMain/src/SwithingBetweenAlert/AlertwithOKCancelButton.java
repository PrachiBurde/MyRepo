package SwithingBetweenAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithOKCancelButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
		
		//switching alert box
		
		String ExpTextOK="You pressed Ok";
				
		driver.switchTo().alert().accept();
		
		String ActText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if (ExpTextOK.equals(ActText)==true)
				{
			       System.out.println("test is passed");
				}
		
		
		driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
		
		String ExpTextCancel="You Pressed Cancel";
		
		driver.switchTo().alert().dismiss();
		ActText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if (ExpTextCancel.equals(ActText)==true)
		{
			System.out.println("test is passed");
		}
		
		
		
	
		
		
		
		
		
	}

}
