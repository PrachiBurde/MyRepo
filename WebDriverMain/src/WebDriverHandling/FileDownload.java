package WebDriverHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		 
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("testing");
		driver.findElement(By.xpath(" //button[@id='createTxt']")).click();
		
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		
//		driver.quit();
		
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("testing pdf download");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		
		driver.quit();
		
		
	}

}
