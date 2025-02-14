package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Explicit wait
		// Thread.sleet - static wait
		// Imp wait - dynamic wait
		// Explcit wait - dynamic wait
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		By input1 = By.id("src");
		By input2 = By.id("dest");
		
		waitforElement(driver, 10, input1);
		waitforElement(driver, 20, input2);
		waitforElement(driver, 40, input2);
		driver.quit();


		}
		public static WebElement waitforElement(WebDriver driver, int timeout, By Locator) {

		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timeout));

		mywait.until(ExpectedConditions.presenceOfElementLocated(Locator));return driver.findElement(Locator);
		}
		//Differe b/w imp and exp wait
	
}


