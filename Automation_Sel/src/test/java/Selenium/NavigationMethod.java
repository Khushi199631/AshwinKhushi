package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		String Title1=driver.getTitle();
		
		System.out.println(Title1);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
