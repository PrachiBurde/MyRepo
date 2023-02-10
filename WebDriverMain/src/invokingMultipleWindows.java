import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingMultipleWindows {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com/");
		String courseName=driver.findElement(By.xpath("(//div[@class='lower-content']//h2/a)[1]")).getText();
		driver.switchTo().window(parentID);
		WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
	    name.sendKeys(courseName);
	    // ScreenShot
	    File file=name.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("logo.png"));
	    //Height & Width
	    System.out.println(name.getRect().getDimension().getHeight());
	    System.out.println(name.getRect().getDimension().getWidth());
	    
		driver.quit();
		       
	}

}
