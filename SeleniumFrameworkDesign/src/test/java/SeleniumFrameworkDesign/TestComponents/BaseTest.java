package SeleniumFrameworkDesign.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import SeleniumFramework.PageObjets.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver initializeDriver() throws IOException
	{
		//Properties class 
		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+
				"//src//main//java//SeleniumFrameworkDesign//resource//GlobalData.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		ChromeOptions options=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		if(browserName.contains("headless")) {
			options.addArguments("headless");
		}
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1440,900));  //Full screen
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public List<HashMap<String,String>> getJsonDataToMap(String filePath) throws IOException
	{
		//read json to string
        String jsonContent=FileUtils.readFileToString(new File(filePath),
        		StandardCharsets.UTF_8);
	    //string to hashmap
        ObjectMapper mapper=new ObjectMapper();
        List<HashMap<String,String>> data=mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>(){
        });
        return data;
	
	}
	
	public String getScreenshot(String TestcaseName,WebDriver driver) throws IOException
    {
    	TakesScreenshot tS=(TakesScreenshot)driver;
    	File source=tS.getScreenshotAs(OutputType.FILE);
    	File file=new File("D:\\batch240\\SeleniumFrameworkDesign" + TestcaseName + ".png");
    	FileUtils.copyFile(source, file);
    	return "D:\\batch240\\SeleniumFrameworkDesign" + TestcaseName + ".png";
    }
	
	@BeforeMethod
	public LandingPage launchApplication() throws IOException
	{
		driver=initializeDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}
	
	@AfterMethod
	public void testClose()
	{
		driver.close();
	}
	
	

}
