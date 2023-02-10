package DataDrivenTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDrowpDownSortedOption {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);

		List<String> OriginalList = new ArrayList<String>();
		List<String> tempList = new ArrayList<String>();
		
		List<WebElement> options = se.getOptions();

		for (WebElement e : options)                                                                  
		{
			OriginalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before sorting Original List:" +OriginalList);
        System.out.println("Before sorting temp list: " + tempList);

		Collections.sort(tempList);
		
		System.out.println("After sorting OriginalList: " + OriginalList);
		System.out.println("After sorting templist: " + tempList);
		
		
		if(OriginalList == tempList)
		{
			System.out.println("Dropdown sorted");
		}
		else 
		{
			System.out.println("Dropdown Not sorted");
		}
			
		
		
		driver.close();
	}

}
