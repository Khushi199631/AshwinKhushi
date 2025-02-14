package ListBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox7 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Khushi");
		driver.findElement(By.name("lastname")).sendKeys("Sahu");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
//		ListBox(Day,"15");
//		ListBox(Month,"May");
//		ListBox(Year,"2022");
		
		String str = "20,Jun,2005";
		
		String [] Date =str.split(",");
		
		ListBox(Day,Date[0]);
		ListBox(Month,Date[1]);
		ListBox(Year,Date[2]);


		}

	private static void ListBox(WebElement element, String Text) {
	Select S1= new Select(element);	
	S1.selectByVisibleText(Text);
	
	}

}
