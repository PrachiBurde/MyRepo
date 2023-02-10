package SeleniumFramework.PageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumFramework.AbstractComponents.AbstractComponents;

public class ConfirmationPage extends AbstractComponents{
	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(css=("h1[class='hero-primary']"))
	WebElement confirmMassage;
	
	public String getComfirmationmessage()
	{
		return confirmMassage.getText();
	}

}
