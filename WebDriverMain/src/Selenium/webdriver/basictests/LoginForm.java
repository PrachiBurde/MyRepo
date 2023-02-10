package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Prachi Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Goofy");

		driver.findElement(By.id("lastName")).sendKeys("Burde");

		driver.findElement(By.id("userEmail")).sendKeys("goofy@gmail.com");

		driver.findElement(By.id("userNumber")).sendKeys("7028353209");

		driver.findElement(By.id("subjectsInput")).sendKeys("English");
		//
		// driver.findElement(By.id("hobbies-checkbox-1")).click();
		//
		// driver.findElement(By.id("currentAddress")).sendKeys("Mahajanawadi, Hingna");

	}

}
