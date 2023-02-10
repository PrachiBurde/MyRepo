import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class form {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Prachi Burde");
		driver.findElement(By.name("email")).sendKeys("prachi23@gamil.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("pr@chi23");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select se = new Select(gender);
		se.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("09-12-2022");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();

	}

}
