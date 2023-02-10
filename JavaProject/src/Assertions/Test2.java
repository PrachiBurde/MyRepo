package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
		
		@Test

		void demoTest() {
			Assert.assertTrue(true); //passed
			Assert.assertEquals("welcome", "Welcome"); // False-Failed
			Assert.assertEquals("selenium", "selenium"); // true-passed
			System.out.println("Successfully passed!");

	}

}
