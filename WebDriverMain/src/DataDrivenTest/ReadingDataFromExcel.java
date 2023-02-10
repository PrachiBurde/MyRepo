package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file =new FileInputStream("./Book2.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("Sheet1"); // Providing sheet name
//		XSSFSheet sheet =workbook.getSheetAt(0); // Providing sheet name
		
		int rowcount =sheet.getLastRowNum(); // return the row count
		
		int colcount=sheet.getRow(0).getLastCellNum(); // return the cell/coloum count
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);   // focus on current row
			
			for(int j=0;j<colcount;j++);
			{
				String value=currentrow.getCell(0).toString();   // read the value from cell
				System.out.print("  " +value);
			}
			System.out.println();
				
				
		}
		
		
		
		
		
		
	}

}
