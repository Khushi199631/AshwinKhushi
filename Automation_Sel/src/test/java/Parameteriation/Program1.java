package Parameteriation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    
    FileInputStream file = new FileInputStream ("F:\\KHUSHI.xlsx");
    
   //String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
    //String Data2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

   double Data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();

   int data2 =(int)Data;
   
    System.out.println(Data);
    
    
	}

}
