package Parameteriation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program4 { //Problem
	
public static void main(String[] args) throws IOException  {
		//problem
FileInputStream file = new FileInputStream("C://Users//Ashwin89//Desktop//TestDataa.xlsx");	
XSSFWorkbook work = new XSSFWorkbook(file);	
XSSFSheet Sheet = work.getSheet("Sheet1");

int Rows = Sheet.getLastRowNum();

int Col = Sheet.getRow(1).getLastCellNum();

System.out.println(Rows);
System.out.println(Col);

for(int R =0;R<=Rows;R++) {//Rows
	XSSFRow row = Sheet.getRow(R);
	
for(int c= 0;c<Col;c++) {
	XSSFCell cell = row.getCell(c);
		
		switch (cell.getCellType()) {
		
		case STRING:
			System.out.println(cell.getStringCellValue());
		break;
		case NUMERIC:
			System.out.println(cell.getNumericCellValue());
		break;
		case BOOLEAN:
			System.out.println(cell.getBooleanCellValue());
		break;
		default:
			System.out.println("No Data found");
		break;
		
		}
	System.out.println("  || ");
	}
System.out.println();
	}

}
}