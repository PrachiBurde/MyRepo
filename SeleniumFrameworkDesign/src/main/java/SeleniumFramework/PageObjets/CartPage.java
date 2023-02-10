package SeleniumFramework.PageObjets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import SeleniumFramework.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents{
	WebDriver driver;
	
	@FindBy(xpath=("//li[@class='totalRow']/button"))
	WebElement checkoutEle;
	
	@FindBy(xpath=("//div[@class='cartSection']/h3"))
	private List<WebElement> productTitle;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
    }

	public boolean VerifyProductDisplay(String productName)
	{
		 boolean match=productTitle.stream().anyMatch(cP->cP.getText().equalsIgnoreCase(productName));
         return match;
	}
	
	public CheckoutPage goToCheckout()
	{
		checkoutEle.click();
		return new CheckoutPage(driver);
	}

		
		
	

}
