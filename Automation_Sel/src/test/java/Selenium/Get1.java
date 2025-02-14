package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get1 {

	public static void main(String[] args) {

		//Step1
		WebDriverManager.chromedriver().setup();
		
		//Step2
		WebDriver driver = new ChromeDriver();
		
		//Step3
		driver.get("https://www.facebook.com/");
		
		
	}

}
