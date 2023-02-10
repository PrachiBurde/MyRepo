package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class liveDemoPagination {  

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all webelement into new(riginal) list
		List<String> originalList = list.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// campare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));

		List<String> price;
		// scan name column with getText -> Banana-> with price
		do 
		{
			List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
			price = row.stream().filter(s -> s.getText().contains("Rice"))// "Banana"))
					.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) 
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getPriceVeggie(WebElement s) {

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
