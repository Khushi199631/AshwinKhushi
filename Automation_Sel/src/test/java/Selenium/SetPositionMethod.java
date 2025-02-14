package Selenium;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Point P1 = new Point(700,200);
		Thread.sleep(2000);
		driver.manage().window().getPosition();
		
		driver.close();
	}

}
