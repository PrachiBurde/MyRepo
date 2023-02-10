package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
     	/* For HorizontalScroll
     	 
     	WebElement horizontalscroll=driver.findElement(By.xpath("//div[@id='resizable']/div[contains(@class,'ui-resizable-e')]"));
		System.out.println(horizontalscroll.getLocation().getX());
		Thread.sleep(3000);*/

		Actions act=new Actions(driver);
		/*act.moveToElement(horizontalscroll).dragAndDropBy(horizontalscroll, 300, 0).build().perform();
		System.out.println(horizontalscroll.getLocation().getX());

		Thread.sleep(3000);*/
		
		/* For VerticalScroll 
		
		WebElement verticalscroll=driver.findElement(By.xpath("//div[@id='resizable']/div[contains(@class,'ui-resizable-s')]"));
        System.out.println(verticalscroll.getLocation().getY());
        Thread.sleep(3000);
        
        act.moveToElement(verticalscroll).dragAndDropBy(verticalscroll, 0, 30).build().perform();
        System.out.println(verticalscroll.getLocation().getY());
        
        Thread.sleep(3000);*/
		
		
    	//For both Side(Horizontal and Vertical)
		
		WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[contains(@class,'ui-resizable-se')]"));
        System.out.println(resize.getLocation());
        Thread.sleep(3000);
        
        act.moveToElement(resize).dragAndDropBy(resize, 50, 50).build().perform();
        System.out.println(resize.getLocation());
        Thread.sleep(3000);
        
        driver.close();
		
         
        
		
		
		
		
	}

}
