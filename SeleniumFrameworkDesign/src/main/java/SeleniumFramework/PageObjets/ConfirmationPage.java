package SeleniumFramework.PageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumFramework.AbstractComponents.AbstractComponents;

public class ConfirmationPage extends AbstractComponents{
	
WebDriver driver;
	
	public ConfirmationPage(WebDriver driver)
	{
		super(driver);
		//initializaton
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="td[align='center']")
	WebElement comfirmationMessage;

//	public String getComfirmationMessage()
//	{
//		return comfirmationMessage.getText();
//	}

	public String getComfirmationMessage()
	{
        return comfirmationMessage.getText();
	}

	}
