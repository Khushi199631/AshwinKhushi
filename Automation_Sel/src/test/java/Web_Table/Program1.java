package Web_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//1.How many rows in table
		List<WebElement> Rows1 =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(Rows1.size()); //7
		int Rows =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        System.out.println(Rows);//7
        
		//2.How many column in a table
		int Col =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
        System.out.println(Col);//3
        
		//3.Retrieve the specific row & col data
		String Text =driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td[3]")).getText();
        System.out.println(Text); //Mexico

        
		//3.Retrieve all row & col data
		for(int i=2 ; i<=Rows ;i++ ) {
		for(int j=1 ;j<=Col ;j++) {
		String Data =driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
		// System.out.print(Data +" | ");
		if(Data.equals("Canada")) {
		System.out.println(i+" "+j);
		}
		}
		System.out.println();
		}
		//driver.close();
	}

}
