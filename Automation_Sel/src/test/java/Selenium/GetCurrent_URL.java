package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrent_URL {

	public static void main(String[] args) {

		String Exp_URL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		String URL = driver.getCurrentUrl();
		if(Exp_URL.equals(URL)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
	}

}
