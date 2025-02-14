package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByattribute {

	public static void main(String[] args) throws InterruptedException {
      
		// XpathByattribute
		// syntax
		// tagname[@attributename="A value"]
		// driver.findelemet(By.Xpath("XPath expression"));
		//< after this is HTML TAG
		//Attributes
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(10000);
		driver.close();
	}

}
