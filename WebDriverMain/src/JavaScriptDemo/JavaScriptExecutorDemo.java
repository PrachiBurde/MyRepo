package JavaScriptDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://in.coursera.org/");
		
		// Flashing
		WebElement joinfree = driver.findElement(By.xpath("//a[@href='/?authMode=signup']"));
//		JavaScriptUtil.flash(joinfree, driver);
		
		
		//Drawing a border and capture screenshot
		JavaScriptUtil.drawBorder(joinfree, driver);
		Thread.sleep(3000);
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Pratik\\Pictures\\Screenshots/coursera.org/"));
		
		
		// Capture the title of page
//		System.out.println(driver.getTitle());
		
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		
		// Clicking on element
//		WebElement loginBtn=driver.findElement(By.xpath("//a[@href='/?authMode=login']"));
//		loginBtn.click();
		
//		JavaScriptUtil.clickElementByJS(loginBtn,driver);
		
		
		//Generate alert window
//		JavaScriptUtil.generateAlert(driver, "You clicked on login button....");
		
		
		// Refreshing page
//		driver.navigate().refresh();
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
		// Scroll down page till we found element
//		WebElement image=driver.findElement(By.xpath("//div[@class='lazyload-wrapper']"));
//	    JavaScriptUtil.scrollIntoView(image, driver);
		
		// Scroll down page till end
		JavaScriptUtil.scrollPageDown(driver);
		
//		driver.close(); 
		
		 
		
		
	}

}
