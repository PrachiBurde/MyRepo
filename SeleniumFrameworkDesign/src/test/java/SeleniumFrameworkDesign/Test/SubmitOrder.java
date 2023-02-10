package SeleniumFrameworkDesign.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumFramework.PageObjets.CartPage;
import SeleniumFramework.PageObjets.CheckoutPage;
import SeleniumFramework.PageObjets.CheckoutPage;
import SeleniumFramework.PageObjets.ConfirmationPage;
import SeleniumFramework.PageObjets.ProductCatalogue;
import SeleniumFrameworkDesign.TestComponents.BaseTest;

public class SubmitOrder extends BaseTest{
	String productName = "ZARA COAT 3";

        @Test//(dataProvider="getData",groups="purchaseOrder")
        public void StandAloneTest2(String email,String password,String productName) throws IOException
        {
		
        ProductCatalogue productCatalogue =landingPage.loginApplication(email,password);
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage chechoutPage = cartPage.goToCheckout();
		chechoutPage.selectCountry("india");
		ConfirmationPage confirmationPage = chechoutPage.submitOrder();

		String confirmMassage = confirmationPage.getComfirmationMessage();
		Assert.assertTrue(confirmMassage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
	}
        
//        @DataProvider
//        public Object[][] getData() throws IOException
//        {
//
//        	List<HashMap<String,String>>data=getJsonDataToMap(System.getProperty("user.dir")+ "//src//test//java//SeleniumFrameworkDesign//Data//PurchaseOrder.Json");
//        	return new Object[] [] {{data.get(0)},{data.get(1)}};
//        	
//        }
        
        
//    	HashMap<String,String>map=new HashMap<String,String>();
//    	map.put("email", "goofy@gmail.com");
//    	map.put("password", "Go0fy108");
//    	map.put("product", "ZARA COAT 3");
//    	
//    	HashMap<String,String>map1=new HashMap<String,String>();
//    	map1.put("email", "goofy10@gmail.com");
//    	map1.put("password", "Goofy108");
//    	map1.put("product", "ADIDAS ORIGINAL");


}
