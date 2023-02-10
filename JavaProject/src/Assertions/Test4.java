package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {

	SoftAssert softassert=new SoftAssert();
	@Test
	void demoTest1() {
		softassert.assertEquals("welcome", "wel"); // false-failed
		softassert.assertAll();
		}
		
	@Test
	void demoTest2() {
		softassert.assertEquals("welcome", "welcome"); // true-passed
		softassert.assertAll();
		
		
		
	}

}
