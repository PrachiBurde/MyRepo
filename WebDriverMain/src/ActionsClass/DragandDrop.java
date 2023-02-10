package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drivr", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act=new Actions(driver);
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).build().perform();
		
//		driver.close();
		
		
		
		
		
	}

}
