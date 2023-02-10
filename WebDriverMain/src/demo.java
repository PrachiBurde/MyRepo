import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drivr", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
		String name=driver.findElement(By.xpath("//label[@for='benz']")).getText().trim();
		System.out.println(name);
		
		WebElement dropdown=driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select se=new Select(dropdown);
		se.selectByVisibleText(name);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		String text=driver.switchTo().alert().getText();	
		if(text.contains(name))
		{
			System.out.println("Alert massege successfully passed");
		}
		else
		{
		    System.out.println("Alert massege failed");
		}
//		driver.close();
	}

}
