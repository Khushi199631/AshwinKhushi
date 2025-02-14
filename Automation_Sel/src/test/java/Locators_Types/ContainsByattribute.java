package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContainsByattribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@name,\"email\")]")).sendKeys("Test@123");

		driver.findElement(By.xpath("//input[contains(@id,\"pass\")]")).sendKeys("TEst@");

		driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_\")]")).click();
		Thread.sleep(50000);
		driver.close();
	}

}
