import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String idName) throws IOException
	{
		ArrayList<String> al=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("D:\\batch240\\WebDriver\\Book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {// 1.
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();// sheet is collections of rows
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();// row is collections of cells
				int k = 0;
				int column = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("FIRST_NAME")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				// 2.
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(idName)) {
						// 3.
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c =cv.next();
							if(c.getCellType()==CellType.STRING)
							{
								al.add(c.getStringCellValue());
//							try {
//								System.out.println(value.getStringCellValue());
//							} catch (IllegalStateException e1) {
//								System.out.println(value.getNumericCellValue());
							}
							else {
								al.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
								
						}
					}
				}
			}
		}
		return al;
	}
	

	public static void main(String[] args) throws IOException {

		// 1.Identify ID column by scanning the entire first row
		// 2.Once column is identified then scan entire ID column to identify 103 ID row
		// 3.After you grab 103 ID row pull all the data of that row and feed into test

		

	}
}
