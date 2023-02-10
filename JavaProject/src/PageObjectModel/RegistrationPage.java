package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage 
{
	// METHOD 1

	WebDriver driver;
	
	By RegLink=By.linkText("REGISTER");
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By Phone=By.name("phone");
	By Email=By.name("userName");
	By Address=By.name("address1");
	By City=By.name("city");
	By State=By.name("state");
	By PosCode=By.name("postalCode");
	By Country=By.name("country");
	By UserName=By.name("email");
	By Password=By.name("password");
	By ConfirmPassword=By.name("confirmPassword");
	By SubmitBtn=By.name("submit");
	
	RegistrationPage(WebDriver d)
	{
		//this.driver=driver;
		driver=d;
	}
	
	public void clickRegLink()
	{
		driver.findElement(RegLink).click();
	}
	
	public void setFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void setPhone(String ph)
	{
		driver.findElement(Phone).sendKeys(ph);
	}
	
	public void setEmail(String mail)
	{
		driver.findElement(Email).sendKeys(mail);
	}
	
	public void setAddress(String add)
	{
		driver.findElement(Address).sendKeys(add);
	}
	
	public void setCity(String city)
	{
		driver.findElement(City).sendKeys(city);
	}
		
	public void setState(String state)
	{
		driver.findElement(State).sendKeys(state);
	}
	
	public void setPosCode(String pcode)
	{
		driver.findElement(PosCode).sendKeys(pcode);
	}
	
	public void setCountry(String country)
	{
		WebElement con=driver.findElement(Country);
		Select drop=new Select(con);
		drop.selectByVisibleText(country);
	}
	
	public void setUserName(String uname)
	{
		driver.findElement(UserName).sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void setConfirmPassword(String confirm)
	{
		driver.findElement(ConfirmPassword).sendKeys(confirm);
	}
	
	public void clickSubmitBtn()
	{
		driver.findElement(SubmitBtn).click();
	}
	
	
	
	
	
	
	
	
	
	
		
		
}


