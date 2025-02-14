package ListBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class List_Box {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Without select class
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Khushboo");
		driver.findElement(By.name("lastname")).sendKeys("Choudhary");
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[contains(text(),'4')]")).click();
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[contains(text(),'6')]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2020')]")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		

		
	}

}
