package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByName2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.findElement(By.name("username")).sendKeys("Tertyu");
		driver.findElement(By.name("password")).sendKeys("WERTY");
		driver.findElement(By.id("submit")).click();
	}

}
