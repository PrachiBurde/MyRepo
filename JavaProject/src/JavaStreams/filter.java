package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		//1 Result
		List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText()
				.contains("Rice")).collect(Collectors.toList());
		//1 Result
		Assert.assertEquals(veggies.size(), filteredList.size());
		
	}

}
