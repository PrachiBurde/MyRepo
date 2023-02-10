package TestNGTutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignupTest {

	@Test(groups={"Smoke"})
	public void signupByemail()
	{
        System.out.println("This is signup by email");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I'm the 1");
	}
	
	@Test
	public void signupByfacebook()
	{
        System.out.println("This is signup by facebook");
	}
	
	@Test
	public void signupBytwitter()
	{
        System.out.println("This is signup by twitter");
       
	}
	
	
	

}
