package Web_Table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/tables");
		int Row =driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr")).size();//7

		System.out.println(Row);//7
		int Col =driver.findElements(By.xpath("//table[@id=\"table1\"]//th")).size();

		System.out.println(Col);//3
		for(int i=1 ;i<=Row ;i++) {
		for(int j=1 ;j<=Col ;j++) {
		String data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody//tr["+4+"]//td["+2+"]")).getText();

		//Tim
		// System.out.print(data +" | ");
		if(data.equals("Tim")) { //True
		System.out.println(i+" "+j);//Mexico

		}
		}
		System.out.println();
		}
		}
		
	}


