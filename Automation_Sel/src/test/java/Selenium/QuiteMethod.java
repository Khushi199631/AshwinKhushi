package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM,Inc')]")).click();
		
		Thread.sleep(1000);
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		driver.navigate().back();
	}

}
