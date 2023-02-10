package SwithingBetweenAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

		driver.findElement(By.xpath("//div[@id='Textbox']")).click();

		// Switching the Text box.

		driver.switchTo().alert().sendKeys("testing");
		driver.switchTo().alert().accept();

		String ExpString = "Hello Prachi How are you today";

		String ActString = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		if (ExpString.equals(ActString) == true) {
			System.out.println();
		}

		driver.findElement(By.xpath("//div[@id='Textbox']")).click();
		driver.switchTo().alert().dismiss();
		
	}
}
