package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentTest {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("This will execute at the end");
	}
	
	@BeforeClass
	public void bfClass()
	{
		System.out.println("This is before class........");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void paymentindoller(String urlname,String key)
	{
        System.out.println("This is payment by doller method");
        System.out.println(urlname);
        System.out.println(key);
	}
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("This is before every method...........");
	}
	
	@AfterMethod
	public void afMethod()
	{
		System.out.println("This is after every method...........");
	}
	
	@Test(groups={"Smoke"})
	public void paymentinrupee()
	{
        System.out.println("This is payment by rupee method");
	}
	
	@AfterClass
	public void afClass()
	{
		System.out.println("This is after class........");
	}
	
	
	

}


