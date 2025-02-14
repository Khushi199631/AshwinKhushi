package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByName {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");


		driver.findElement(By.name("email")).sendKeys("Tertyu");
		driver.findElement(By.name("pass")).sendKeys("WERTY");
		driver.findElement(By.name("login")).click();

	}

}
