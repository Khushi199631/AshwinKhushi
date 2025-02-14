package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		
		// Syntax - //Tagname[text()='text Value'];
		// tagname[@attributename="avalue"];
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Test123");

		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes,Continue']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
