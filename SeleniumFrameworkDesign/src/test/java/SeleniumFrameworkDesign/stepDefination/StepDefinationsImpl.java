package SeleniumFrameworkDesign.stepDefination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import SeleniumFramework.PageObjets.CartPage;
import SeleniumFramework.PageObjets.CheckoutPage;
import SeleniumFramework.PageObjets.ConfirmationPage;
import SeleniumFramework.PageObjets.LandingPage;
import SeleniumFramework.PageObjets.ProductCatalogue;
import SeleniumFrameworkDesign.TestComponents.BaseTest;
import io.cucumber.java.en.*;

public class StepDefinationsImpl extends BaseTest{

    public LandingPage landingPage;
    public  ProductCatalogue productCatalogue;
    public ConfirmationPage confirmationPage; 
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException
	{
		landingPage=launchApplication();
	}
	
    @Given("^Logged in with usename (.+) and password (.+)$")
    public void logged_in_username_and_password(String username,String password)
    {
        productCatalogue =landingPage.loginApplication(username,password);
    }
    
    @When("^I add the product (.+) to Cart$")
    public void i_add_the_product_to_cart(String productName)
    {
    	List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
    }
    
    @And("^Checkout (.+) and submit the order$")
    public void checkout_submit_the_order(String productName)
    {
    	CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage chechoutPage = cartPage.goToCheckout();
		chechoutPage.selectCountry("india");
		confirmationPage = chechoutPage.submitOrder();
    }
    
    @Then("{string} message is displayed on ConfirmationPage")
    public void message_displayed_confirmationPage(String string)
    {
    	String confirmMassage = confirmationPage.getComfirmationMessage();
   	    Assert.assertTrue(confirmMassage.equalsIgnoreCase(string));
   	    driver.close();
    }
    
    @Then("{string} message is displayed")
    public void something_message_displayed(String string1)
    {
    	Assert.assertEquals(string1, landingPage.getErrorMessage());
   	    driver.close();
    }





}
