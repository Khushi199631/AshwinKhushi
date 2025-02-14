package ListBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_Box2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Khushboo");
		driver.findElement(By.name("lastname")).sendKeys("Choudhary");
		
		Thread.sleep(5000);
		WebElement Day=driver.findElement(By.id("day"));
		WebElement Month=driver.findElement(By.id("month"));
		WebElement Year=driver.findElement(By.id("year"));

		//Select by visible text
		Select S1 = new Select(Day);
		S1.selectByVisibleText("10");
		Thread.sleep(5000);
		Select S2 = new Select(Day);
		S2.selectByVisibleText("May");
		Thread.sleep(5000);
		Select S3 = new Select(Day);
		S3.selectByVisibleText("2010");
		Thread.sleep(5000);
		Select S4 = new Select(Day);
		S4.selectByVisibleText("11");
		Thread.sleep(5000);
		Select S5 = new Select(Day);
		S5.selectByVisibleText("June");
		Thread.sleep(5000);
		Select S6 = new Select(Day);
		S6.selectByVisibleText("2012");
		
		driver.close();
		
		
	}

}
