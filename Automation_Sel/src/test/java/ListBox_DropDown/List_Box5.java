package ListBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_Box5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Khushi");
		driver.findElement(By.name("lastname")).sendKeys("Raut");
		
		Thread.sleep(5000);

		WebElement selectDay =  driver.findElement(By.id("day"));
		WebElement selectmonth = driver.findElement(By.id("month"));
		WebElement selectyear = driver.findElement(By.id("year"));
		
		Select Day = new Select(selectDay);
		Select Month = new Select(selectmonth);
		Select Year = new Select(selectyear);
		
		Day.selectByVisibleText("10");
		Thread.sleep(2000);
		Month.deselectByVisibleText("8");
		Year.selectByVisibleText("2022");
		
		driver.close();
		
		

		
		
		
	}

}
