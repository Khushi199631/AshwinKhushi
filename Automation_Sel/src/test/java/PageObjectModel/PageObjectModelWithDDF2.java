package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectModelWithDDF2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Path = "C:/Users/Ashwin89/Desktop";


		FileInputStream File = new FileInputStream(Path);
		Workbook workbook = WorkbookFactory.create(File);
		Sheet sheet = workbook.getSheet("Sheet1");
		String username = sheet.getRow(0).getCell(1).getStringCellValue();
		String Passowrd = sheet.getRow(0).getCell(1).getStringCellValue();
		PageObjectModelWithDDF LP = new PageObjectModelWithDDF(driver);
		LP.Username1(username);
		LP.UserPass(Passowrd);
	
}
}