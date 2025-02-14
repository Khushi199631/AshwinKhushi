package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//Thread.sleep(1000);
		
		driver.navigate().back();

	}

}
