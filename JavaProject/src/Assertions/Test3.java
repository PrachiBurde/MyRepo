package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {

	SoftAssert softassert=new SoftAssert();
	
	@Test
	void demoTest() {
		softassert.assertTrue(true); // passed
		softassert.assertEquals("welcome", "Welcome"); // false-failed
		softassert.assertEquals("selenium", "selenium");
		System.out.println("Successfully passed");
		softassert.assertAll();
		
		
		
		

	}

}
