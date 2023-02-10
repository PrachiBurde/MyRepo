package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {

	// METHOD 2 (MOST POPULARE)

	WebDriver driver;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	WebElement RegLink;

	@FindBy(how = How.NAME, using = "firstName") // Syntax 1
	WebElement FirstName;

	@FindBy(name = "lastName") // Syntax 2
	WebElement LastName;

	@FindBy(name = "phone")
	WebElement Phone;

	@FindBy(name = "userName")
	WebElement Email;

	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement PosCode;

	@FindBy(name = "country")
	WebElement Country;

	@FindBy(name = "email")
	WebElement UserName;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(name = "submit")
	WebElement SubmitBtn;

	RegistrationPage2(WebDriver d) {
		// this.driver=driver;
		driver = d;
		PageFactory.initElements(d, this); // aditional method
	}

	public void clickRegLink() {
		RegLink.click();
	}

	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}

	public void setPhone(String ph) {
		Phone.sendKeys(ph);
	}

	public void setEmail(String mail) {
		Email.sendKeys(mail);
	}

	public void setAddress(String add) {
		Address.sendKeys(add);
	}

	public void setCity(String city) {
		City.sendKeys(city);
	}

	public void setState(String state) {
		State.sendKeys(state);
	}

	public void setPosCode(String pcode) {
		PosCode.sendKeys(pcode);
	}

	public void setCountry(String country) {
		WebElement con = Country;
		Select drop = new Select(con);
		drop.selectByVisibleText(country);
	}

	public void setUserName(String uname) {
		UserName.sendKeys(uname);
	}

	public void setPassword(String pass) {
		Password.sendKeys(pass);
	}

	public void setConfirmPassword(String confirm) {
		confirmPassword.sendKeys(confirm);
	}

	public void clickSubmitBtn() {
		SubmitBtn.click();
	}

}
