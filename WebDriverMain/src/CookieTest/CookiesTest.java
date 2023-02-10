package CookieTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.amazon.in/");

		Set<Cookie> cookies = driver.manage().getCookies(); // Capture all the cookies

		System.out.println("Size of cookies:" + cookies.size()); // Capture number of cookies

		/*
		 * for(Cookie cookie:cookies) //read and print number of cookies {
		 * System.out.println(cookie.getName()+":"+cookie.getValue()); // Print name and
		 * value of cookies }
		 */

		// System.out.println(driver.manage().getCookieNamed("session-id-time")); //
		// Print specific cookie according to the name

		// Adding a new cookie
		Cookie cobj = new Cookie("mycookie1234", "1234567890");
		driver.manage().addCookie(cobj);

		cookies = driver.manage().getCookies();

		System.out.println("Size of cookies:" + cookies.size()); // print size of cookies

		for (Cookie cookie : cookies) // read and print number of cookies
		{
			System.out.println(cookie.getName() + ":" + cookie.getValue()); // print name and value of cookies
		}
        // Deleting cookie
		driver.manage().deleteCookie(cobj);
		cookies = driver.manage().getCookies();

		System.out.println("Size of cookies:" + cookies.size()); // print size of cookies

		// Deleting all cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();

		System.out.println("Size of cookies:" + cookies.size()); // 0
		
		driver.quit();

	}

}
