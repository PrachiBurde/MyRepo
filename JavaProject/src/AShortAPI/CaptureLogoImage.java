package AShortAPI;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement logoImage = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']"));
		Thread.sleep(10000);
		// capture ss of element
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImage);
		 ImageIO.write(logoImageScreenshot.getImage(), "png",
		 new File("C://Users//Pratik//Pictures//Screenshots//OrangeHRMlogo.png"));
		
		// File f = new
		// File("C://Users//Pratik//Pictures//Screenshots//OrangeHRMlogo.png");
		//
		// if (f.exists()) {
		// System.out.println("Image File Capture");
		// } else {
		// System.out.println("Image File NOT Exist");
		// }

		driver.close();

	}

}
