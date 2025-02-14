package ListBox_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_All_List {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Khushi");
		driver.findElement(By.name("lastname")).sendKeys("Sahu");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Lunhm");
		
		String str = "12,Apr,2006";
		String [] Date =str.split(",");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		Select S1 = new Select(Day);
		List<WebElement> D1 =S1.getOptions();
		System.out.println(D1.size());
		for(int i =0;i<D1.size();i++) {
			String D2 =D1.get(i).getText();
			System.out.println(D2);
			
			if(D2.equals(Date[0])) {
				D1.get(i).click();
				break;
			}
		}
		
//		Select S2 = new Select(Month);
//		List<WebElement> K =S2.getOptions();
//		System.out.println(K.size());
//		
//		for(int i =0;i<K.size();i++) {
//			String D3 = K.get(i).getText();
//			if(D3.equals(Date[1])) {
//				K.get(i).click();
//				break;
//			}
//		}
//		
//		Select S3 = new Select(Year);
//		List<WebElement> GF =S3.getOptions();
//		System.out.println(GF.size()); 
//		
//		for(int i= 0;i<GF.size();i++) {
//			String DK =GF.get(i).getText();
//			if(DK.equals(Date[2])) {
//				GF.get(i).click();
//				break;
//			}
//		}
//			
//		
		
		
	}

}
