package RelativeLocatores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;  // STEP 1

import org.openqa.selenium.By;

public class part1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// STEP 2 -remeber (with(By.tagName)
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dobEditBox=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dobEditBox)).click();
		
		// REAL TIME FRAME WORK
		WebElement checkBox=driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click();
		
		WebElement radioButton=driver.findElement(By.cssSelector("[id='inlineRadio1']"));
		driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).click();

	}

}
