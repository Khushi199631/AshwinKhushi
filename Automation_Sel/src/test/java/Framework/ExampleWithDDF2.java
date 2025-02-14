package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleWithDDF2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		// Step 1
		WebDriverManager.chromedriver().setup();
		// Step 2
		WebDriver driver = new ChromeDriver();
		// Step 3
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Enter username
		String path = "C:/Users/Ashwin89/eclipse-workspace/Automation_Sel/src/test/java/Com/test/TestDataa.xlsx";

		FileInputStream file = new FileInputStream(path);
		// Enter Username
		String Username =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);

		// Enter Passowrd
		FileInputStream File2 = new FileInputStream(path);
		String Password =WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String Text = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")).getText();
		if (Text.equals(Password)) {
		System.out.println("Login succesfilly");
		} else {
		System.out.println("Incorrect home page name");
		}
		driver.quit();
	}

}
