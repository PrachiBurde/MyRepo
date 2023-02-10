package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drivr", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(button).build().perform();  //right click on button
		
		driver.findElement(By.xpath("//span[text()='Paste']")).click();  //click on paste option
		System.out.println(driver.switchTo().alert().getText());  //capture the text from text box
		driver.switchTo().alert().accept();  //close the alert box
		
		driver.close();
		
		
		
		
		
		

	}

}
