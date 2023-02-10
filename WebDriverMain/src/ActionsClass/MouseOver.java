package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drivr","D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
    	Actions Act=new Actions(driver);
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();*/
		
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		
		Actions act=new Actions(driver);
		
		WebElement interaction=driver.findElement(By.xpath("//a[@href='Interactions.html']"));
		WebElement dragdrop=driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		WebElement st=driver.findElement(By.xpath("//a[@href='Static.html']"));
		
		/*act.moveToElement(interaction).build().perform(); // Mouseover to interactions tab
		act.moveToElement(dragdrop).build().perform();  // Mouse over to drag and drop tab
		act.moveToElement(st).click().build().perform(); // Mouse over to static tab and click the element*/
		
		act.moveToElement(interaction).moveToElement(dragdrop).moveToElement(st).click().build().perform(); 
		
		driver.close();
	
		
		
		
		
		
		
		
		
	}

}
