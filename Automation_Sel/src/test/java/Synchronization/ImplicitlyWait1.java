package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait1 {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//Thread.sleet - static wait - 20 Sec -20
			//Imp wait - dynamix wait - 20 - 10 - visible - 10
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Syntax

			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("Test");
			driver.findElement(By.id("pass1")).sendKeys("TEst"); //18
			driver.quit();
	}

}
