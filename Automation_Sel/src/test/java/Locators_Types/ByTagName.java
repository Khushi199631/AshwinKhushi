package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByTagName {

	public static void main(String[] args) {
      
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.tagName("input")).sendKeys("Rahul");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).clear();
	}

}
