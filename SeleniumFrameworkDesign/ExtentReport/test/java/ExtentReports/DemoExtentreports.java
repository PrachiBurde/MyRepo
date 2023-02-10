package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DemoExtentreports {

ExtentReports extent;
	
	@BeforeTest
	public void confi()
	{
		// ExtentReport, ExtentSparkRepoter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter repoter=new ExtentSparkReporter(path);
		repoter.config().setReportName("Web Automation Results");
		repoter.config().setDocumentTitle("Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Tester", "Prachi Burde");
		
	}
	
	@Test
	public void initialDemo()
	{
		ExtentTest test=extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
//		test.fail("Results do not match");
		extent.flush();

	}

}


	
		
	


