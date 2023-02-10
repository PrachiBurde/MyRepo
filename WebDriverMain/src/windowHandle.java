import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		 Set<String> windows = driver.getWindowHandles(); // ParentId, ChildId
		 Iterator<String> it = windows.iterator();
		 String parentId = it.next();
		 String childId = it.next();
		
		 driver.switchTo().window(childId);
		
		 System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		 String emailId = driver.findElement(By.cssSelector("p[class='im-parared']")).getText()
		          .split("at")[1].trim().split(" ")[0].trim();
		 driver.switchTo().window(parentId);
		 driver.findElement(By.id("username")).sendKeys(emailId);

//		driver.get("https://the-internet.herokuapp.com/windows");
//		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
//		driver.findElement(By.cssSelector("div[class='example']"));
//		Set<String> windows = driver.getWindowHandles(); // parentId, childId
//		Iterator<String> it = windows.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
//
//		driver.switchTo().window(parentId);
//		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
//
//		driver.close();

	}

}
