package WindowHandler;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
	Set<String> S1 	= driver.getWindowHandles();
	
	Iterator<String> S2 = S1.iterator();
	
	String P = S2.next();
	String C = S2.next();
	
	driver.switchTo().window(C);
	
	WebElement A5 = driver.findElement(By.xpath("//input[@type=\"email\"]"));
	A5.sendKeys("abc@gmail.com");
	A5.click();
	System.out.println(A5);
	
	driver.close();
	}

}
