package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Element = driver.findElement(By.id("email"));
		Element.sendKeys("Test@123");
		Thread.sleep(5000);
		Element.clear();
		WebElement Ele =driver.findElement(By.id("pass"));
		Ele.sendKeys("@#$%^&");
		Thread.sleep(5000);
		Ele.clear();
		Thread.sleep(5000);
		driver.close();
	}

}
