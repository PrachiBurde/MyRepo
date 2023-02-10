package WebDriverHandling;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		// Capture links from a webpage
		List <WebElement >links= driver.findElements(By.tagName("a"));
		
		// Numbers of links
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			// By using href attribute we can get URL of required links
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			// Create a connetion by using url object 'link'
			HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			Thread.sleep(3000);
			
			httpConn.connect();
			
			int rescode=httpConn.getResponseCode(); // Return respose code. if respose code is above 400: broken links
			
			if (rescode>=400)
			{
				System.out.println(url +" - "+ "is broken link" );
			}
			
			else
			{
				System.out.println(url +" - "+ "is valid link" );
			}
			
		}
		
		driver.close();
		
		
	}

}
