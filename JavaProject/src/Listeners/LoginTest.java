package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	void loginByEmail() {
		System.out.println("Login by email");
		Assert.assertEquals("Prachi", "Prachi"); // true
	}

	@Test
	void loginByFacebook() {
		System.out.println("Login by facebook");
		Assert.assertEquals("Prachi", "Burde"); // false
	}

}
