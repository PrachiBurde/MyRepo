package src.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoOnlineShopping {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://themeforest.net/category/site-templates/retail/shopping?term=demo");
		driver.findElement(By.cssSelector("a[class='shared-item_cards-item_name_component__itemNameLink']")).click();
		
		driver.findElement(By.cssSelector("button[name='button']")).click();
		System.out.println(driver.findElement(By.cssSelector("h2[class='t-heading -size-m']")).getText());
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[class='e-btn--3d -color-primary']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[class='e-btn--3d -color-primary -width-full -size-l']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Goofy");
		driver.findElement(By.id("lastName")).sendKeys("Burde");
		driver.findElement(By.id("email")).sendKeys("goofy108@gmail.com");
		driver.findElement(By.id("username")).sendKeys("goofybu");
		driver.findElement(By.id("password")).sendKeys("Pr@chi23");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.cssSelector("div[class='recaptcha-checkbox-border']")).click();
		driver.findElement(By.cssSelector("input[id='extraInformation.promotionsSubscriber']")).click();
		driver.findElement(By.cssSelector("button[class='js-sso-forms-submit e-btn--3d -color-primary']")).click();
		
		driver.findElement(By.cssSelector("input[class='f-input -type-string -width-full valid']"))
		                       .sendKeys("Mahajanwadi, Hingna");
        driver.findElement(By.cssSelector("input[id='billing_details_form_city']")).sendKeys("Nagpur");
		driver.findElement(By.cssSelector("select[name='billing_details_form[region]']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.cssSelector("option[value='Maharashtra']")), "Maharashtra").build()
				.perform();
		
	}

}
