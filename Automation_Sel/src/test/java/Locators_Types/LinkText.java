package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgottenpassword?")).click();

		driver.findElement(By.linkText("Create aPage")).click();
		// driver.findElement(By.linkText("Sign Up")).click();

		Thread.sleep(5000);
		driver.close();	
	}

}
