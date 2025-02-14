package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByattribute1 {

	public static void main(String[] args) {
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-invalid ng-invalid-required ng-touched\"]")).sendKeys("Test");
        
        driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-valid ng-touched\"]")).sendKeys("Nagpur");
        
        driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();  
        
        driver.close();
	}

}
