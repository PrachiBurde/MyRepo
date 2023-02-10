package TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(dataProvider="getData")
	public void loginByemail(String username,String password)
	{
		System.out.println("This is login by email");
		System.out.println(username);
	    System.out.println(password);
	}
	
	@AfterSuite
	public void afSuit()
	{
		System.out.println("Goofy");
	}
	
	@Test
	public void loginByFacebook()
	{
		System.out.println("This is login by facebook");
	}
	
	@Test(groups={"Smoke"})
	public void loginBytwitter()
	{
		System.out.println("This is login by twitter");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
				
		// 1st combination username password good credit history = row
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		//2nd username password no credit history 
		data[1][0]="secondsetusrname";
		data[1][1]="secondpassword";
		
		//3rd freudelent credit history
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
	
	

}


