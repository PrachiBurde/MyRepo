import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class realtimeactionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);
		// MouseOver
		act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")))
		       .contextClick().build().perform();

		// Sendkeys in capital letter
		act.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click()
		       .keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		driver.close();

	}

}
