package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test5 {
	
		SoftAssert softassert1=new SoftAssert();
		SoftAssert softassert2=new SoftAssert();
		
		@Test
		void demoTest1() {
			softassert1.assertEquals("welcome", "wel"); // false-failed
			softassert1.assertAll();
			}
			
		@Test
		void demoTest2() {
			softassert2.assertEquals("welcome", "welcome"); // true-passed
			softassert2.assertAll();
	}

}
