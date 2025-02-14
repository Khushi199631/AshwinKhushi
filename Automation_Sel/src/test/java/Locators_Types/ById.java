package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ById {

	public static void main(String[] args) throws InterruptedException {
          //ID Inspect direct copy paste
		
          WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		//ID
		driver.findElement(By.id("id=\"login-username\"")).sendKeys("testnaveen@yahoo.com");
		
		Thread.sleep(2000);
		driver.findElement(By.id("id=\"login-signin\"")).click();
		
//		driver.findElement(By.cssSelector("#login-username\")).sendKeys("test@yahoo.com");
//		driver.findElement(By.cssSelector(c))
		
		
		
	}

}
