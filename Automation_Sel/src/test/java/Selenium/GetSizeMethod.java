package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
    
    WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
        Dimension D2 = new Dimension(700,200);
		
		driver.manage().window().setSize(D2);
		
		Thread.sleep(8000);
		
		Dimension Test = driver.manage().window().getSize();
		
		System.out.println(Test);
		
		driver.close();
		
		
	}

}
