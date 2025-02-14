package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleMethod {

	public static void main(String[] args) {

		String Expected_Title = "https://www.google.com/maps";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps");
		
		String Actual_Title=driver.getTitle();
		
		if(Expected_Title.equals(Actual_Title)) {
			
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect");
		}
		driver.close();
	}

}
