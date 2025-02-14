package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByID2 {

	public static void main(String[] args) {

		     WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.findElement(By.id("id=\"username\"")).sendKeys("Student");
			driver.findElement(By.id("id=\"password\"")).sendKeys("Test@123");
			driver.findElement(By.id("Submit")).click();
	}

}
