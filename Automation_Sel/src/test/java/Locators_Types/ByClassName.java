package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByClassName {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("RTYU");
		driver.findElement(By.id("pass")).sendKeys("ERTYH");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		//driver.findElement(By.className("inputtext._55r1._6luy._9npi")).sendKeys("$%^&");
		// driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1selected _51sy")).click();
		// driver.findElement(By.t)
	}

}
