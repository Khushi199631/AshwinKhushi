package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.test.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleWithDDF {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		Xls_Reader reader = new Xls_Reader("C:/Users/Ashwin89/eclipse-workspace/Automation_Sel/src/test/java/Com/test/TestDataa.xlsx");
		//ye class ki method leni hai vo nonstatic hai is lie obj create kiya
		String FN =reader.getCellData("sheet1", "First Name", 2);
		System.out.println(FN);
		
		String LN =reader.getCellData("sheet1", "Surname", 2);
		System.out.println(LN);
		
		String MN =reader.getCellData("sheet1", "mobileno", 2);
		System.out.println(MN);
		
		String DAY =reader.getCellData("sheet1", "day", 2);
		System.out.println(MN);
		
		String MONTHH =reader.getCellData("sheet1", "month", 2);
		System.out.println(MN);
		
		String YEAR =reader.getCellData("sheet1", "year", 2);
		System.out.println(MN);
		
		driver.findElement(By.name("firstname")).sendKeys(FN);
		driver.findElement(By.name("lastname")).sendKeys(LN);
		
		Select S1 = new Select(driver.findElement(By.id("day")));
		S1.selectByVisibleText(DAY);
		
		Select S2 = new Select(driver.findElement(By.id("month")));
		S1.selectByVisibleText(MONTHH);
		
		Select S3 = new Select(driver.findElement(By.id("year")));
		S1.selectByVisibleText(YEAR);
		
		driver.findElement(By.xpath("//input[@id=\"u_0_h_Kg\"]")).sendKeys(MN);
		
		

		
		
		
	}

}
