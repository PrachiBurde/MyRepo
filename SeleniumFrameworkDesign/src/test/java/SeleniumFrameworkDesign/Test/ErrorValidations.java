package SeleniumFrameworkDesign.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumFramework.PageObjets.LandingPage;
import SeleniumFrameworkDesign.TestComponents.BaseTest;
import SeleniumFrameworkDesign.TestComponents.Retry;

public class ErrorValidations extends BaseTest {
	
	@Test(retryAnalyzer=Retry.class)
	public void standAloneTest2()
	{
	    String productName = "ZARA COAT 3";
	    landingPage.loginApplication("goofy@gmail.com", "Go0fy18");
	    Assert.assertEquals("Incorrect email or password",landingPage.getErrorMessage());

	}

	
	

}
