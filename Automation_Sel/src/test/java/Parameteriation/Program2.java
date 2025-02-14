package Parameteriation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

FileInputStream File1 = new FileInputStream("/F:/KHUSHI.xlsx/");
 String Username =WorkbookFactory.create(File1).getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
 System.out.println(Username);
 
 
FileInputStream File2 = new FileInputStream("/F:/KHUSHI.xlsx/");
String Pass = WorkbookFactory.create(File2).getSheet("Sheet3").getRow(2).getCell(0).getStringCellValue();
  System.out.println(Pass);
  
 WebDriverManager.chromedriver().setup();
 
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys(Username);


driver.findElement(By.id("pass")).sendKeys(Pass);



 
			
	}

}
