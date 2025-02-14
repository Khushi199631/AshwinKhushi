package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup7 {

	public static void main(String[] args) {
//Not understand
		
		//Authentication popup
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// Alert Alt = driver.switchTo().alert();
		//
		// Alt.sendKeys("admin");

		// Alt.sendKeys("admin");

Boolean Test=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).isDisplayed();
	
System.out.println(Test);
	
	}

}
