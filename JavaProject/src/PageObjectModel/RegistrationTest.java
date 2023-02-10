package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {

	@Test
	public void VerifyFlightreg() {
		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// RegistrationPage RGPage = new RegistrationPage(driver);
		RegistrationPage2 RGPage = new RegistrationPage2(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://demo.guru99.com/test/newtours/");

		RGPage.clickRegLink();
		RGPage.setFirstName("Prachi");
		RGPage.setLastName("Burde");
		RGPage.setPhone("9876543210");
		RGPage.setEmail("prachi@gamil.com");
		RGPage.setAddress("Mahajanawadi,Hingna road Nagpur");
		RGPage.setCity("Nagpure");
		RGPage.setState("Maharastra");
		RGPage.setPosCode("441110");
		RGPage.setCountry("INDIA");
		RGPage.setUserName("Pr@chi23");
		RGPage.setPassword("23022000");
		RGPage.setConfirmPassword("23022000");

		RGPage.clickSubmitBtn();

		// Validation

		if (driver.getPageSource().contains("Thank you for registering.")) {
			System.out.println("Your registered successfully");
		} else {
			System.out.println("Your registration failed");
		}

		driver.close();

	}

}
