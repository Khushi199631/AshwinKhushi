package Parameteriation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream F1 = new FileInputStream("/C:/Users/Ashwin89/Desktop/TestDataa.xlsx/");
		
	XSSFWorkbook S1 = new XSSFWorkbook(F1);
	
	XSSFSheet S2 = S1.getSheet("Sheet1");
	
	int A1 =S2.getLastRowNum();
	int A2 =S2.getRow(1).getLastCellNum();
	
	System.out.println(A1);
	System.out.println(A2);
	
	for(int R =0;R<A2;R++) {
		XSSFRow Row =S2.getRow(R);
	for(int c =0 ;c<A2 ;c++) {
	    XSSFCell cell = Row.getCell(c);
	    
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
		
	}

	
	}

	}
}