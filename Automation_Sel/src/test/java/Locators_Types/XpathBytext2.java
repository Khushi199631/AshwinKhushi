package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBytext2 {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create newaccount']")).click();

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Test");

		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Test");
		
	}

}
