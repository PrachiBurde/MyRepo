package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class dataProvide {

	DataFormatter formatter=new DataFormatter();
	@Test(dataProvider = "driveTest")
	public void testCaseData(String id, String firstName, String lastName, String salary) {
		System.out.println(id + firstName + lastName + salary);
	}

	@DataProvider(name = "driveTest")
	public Object[][] getData() throws IOException {
//		Object[][] data = { 
//				{ "101", "AB", "BA", "1000" }, 
//				{ "102", "CD", "DC", "2000" },
//				{ "103", "EF", "FE", "3000 "} };
		//every array we should be store in 1 array
		FileInputStream fis=new FileInputStream("D:\\batch240\\WebDriver\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell=row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;
	}

}
