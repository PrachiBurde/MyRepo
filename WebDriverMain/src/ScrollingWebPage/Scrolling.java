package ScrollingWebPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.nationsonline.org/oneworld/countries_of_the_world.htm");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		// Scrolling by using pixel
//		js.executeScript("window.scrollBy(0,5000)","");
		
		
		// Scrolling page till we find element
//		WebElement flag=driver.findElement(By.xpath("//div[@id='IND']"));
//	    js.executeScript("arguments[0].scrollIntoView();",flag);
	    
		// Scroll page till end/bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
		
		
		driver.close();
		
		

  }

}
