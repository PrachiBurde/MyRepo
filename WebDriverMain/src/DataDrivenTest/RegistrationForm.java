package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream file = new FileInputStream("./Book2.xlsx");

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		

		// get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // Providing sheet name

		// get first row from the workbook
		int noOfRows = sheet.getLastRowNum(); // return the row count

		System.out.println("no. of records in the excel sheet:" + noOfRows);
		int colcount = sheet.getRow(0).getLastCellNum(); // return the cell/coloum count

		for (int row = 1; row <= noOfRows; row++) {

			XSSFRow current_row = sheet.getRow(row);

			String FIRST_NAME = current_row.getCell(0).getStringCellValue();
			String LAST_NAME = current_row.getCell(1).getStringCellValue();
			String PHONE = Double.toString(current_row.getCell(2).getNumericCellValue());
			String EMAIL = current_row.getCell(3).getStringCellValue();
			String ADDRESS = current_row.getCell(4).getStringCellValue();
			String CITY = current_row.getCell(5).getStringCellValue();
			String STATE = current_row.getCell(6).getStringCellValue();
			String POSTAL_CODE = Double.toString(current_row.getCell(7).getNumericCellValue());
			String USER_NAME = current_row.getCell(8).getStringCellValue();
			String PASSWORD = Double.toString(current_row.getCell(9).getNumericCellValue());

			// registration process

			driver.findElement(By.linkText("REGISTER")).click();

			// Contact details
			driver.findElement(By.name("firstName")).sendKeys(FIRST_NAME);
			driver.findElement(By.name("lastName")).sendKeys(LAST_NAME);
			driver.findElement(By.name("phone")).sendKeys(PHONE);
			driver.findElement(By.name("userName")).sendKeys(EMAIL);

			// Mailing details
			driver.findElement(By.name("address1")).sendKeys(ADDRESS);
			driver.findElement(By.name("city")).sendKeys(CITY);
			driver.findElement(By.name("state")).sendKeys(STATE);
		    driver.findElement(By.name("postalCode")).sendKeys(POSTAL_CODE);

			// Users details
			driver.findElement(By.name("email")).sendKeys(USER_NAME);
//			driver.findElement(By.name("password")).sendKeys(PASSWORD);
//			driver.findElement(By.name("confirmPassword")).sendKeys(PASSWORD);

			driver.findElement(By.name("submit")).click();

		}

	}

}
