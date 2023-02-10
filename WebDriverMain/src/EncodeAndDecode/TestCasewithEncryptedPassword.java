package EncodeAndDecode;

import java.time.Duration;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCasewithEncryptedPassword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.nopcommerce.com/en/demo");
		
		Actions act=new Actions(driver);
				
		WebElement loginIcon=driver.findElement(By.xpath("//span[text()='My account ']"));
		act.moveToElement(loginIcon).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();

		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("prachi23");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("cHJhY2hpMjM="));

//		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	static String decodeString(String password) {
		byte[] decodedString = Base64.decodeBase64(password);
		return (new String(decodedString));
	}

}
