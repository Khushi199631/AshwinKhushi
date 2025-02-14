package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com/register");
			Thread.sleep(3000);
			
 		WebElement FN = driver.findElement(By.id("FirstName"));	
			WebElement LN = driver.findElement(By.id("LastName"));
			WebElement EM = driver.findElement(By.id("Email"));
			WebElement PS = driver.findElement(By.name("Password"));
			WebElement CP = driver.findElement(By.id("ConfirmPassword"));
			WebElement SUBMIT = driver.findElement(By.id("register-button"));
			
 		Thread.sleep(3000);
			boolean Check_SUBMIT =SUBMIT.isDisplayed();//for submit button
			System.out.println("Check Submit button is display  ==" + Check_SUBMIT);
			
			FN.sendKeys("KNOWLEDGE");
			LN.sendKeys("SHARE");
			EM.sendKeys("testknowledgeshare@gmail.com");
			PS.sendKeys("123456");
			CP.sendKeys("123456");
			
			
	}

}
