package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AXpath {

	public static void main(String[] args) {
       
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("ERTYU");

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("ERTY");
	}

}
