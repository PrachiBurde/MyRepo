package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaymentReturns {

	@Test(groups={"Smoke"})
	public void paymentreturnbybank()
	{
        System.out.println("This is payment return by bank");
        Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("This will execute first");
	}

}


