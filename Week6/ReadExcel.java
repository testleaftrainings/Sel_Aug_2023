package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String excelName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("data/"+excelName+".xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
//		XSSFRow row = sheet.getRow(2);
//		
//		XSSFCell cell = row.getCell(3);
//		System.out.println(cell);
		
		//to get the total number of rows
		int rowCount = sheet.getLastRowNum();
		System.out.println
		("The total number of rows :" +rowCount);
		
		//to get the total number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The total no: of columns: " +columnCount);
		
		String[][] data = new String[rowCount][columnCount];
		//iterate through loop
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				//data[0][0]
			}
		}
		wb.close();
		return data;
		
		

	}

}
