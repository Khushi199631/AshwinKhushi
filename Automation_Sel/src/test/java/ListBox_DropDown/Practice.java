package ListBox_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.name("firstname")).sendKeys("Atuall");
		driver.findElement(By.name("lastname")).sendKeys("Bukade");
		
		String Str ="6/Aug/2012";
		String[] date = Str.split("/");
		
		
		WebElement Day =driver.findElement(By.id("day"));
		WebElement Month =driver.findElement(By.id("month"));
		WebElement Year =driver.findElement(By.id("year"));
		
		Select S1 = new Select(Day);
		List<WebElement> A =S1.getOptions();
		System.out.println(A.size());
		
		for(int i =0;i<A.size();i++) {
			String S =A.get(i).getText();
			System.out.println(S);
			if(S.equals(date[0])) {
				A.get(i).click();
			
			}
		}


		

	}

}
