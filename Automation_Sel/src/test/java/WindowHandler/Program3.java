package WindowHandler;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		Thread.sleep(5000);
		
		Set<String> W1 =driver.getWindowHandles();
		Iterator<String> D1 = W1.iterator();
		
		String Pa = D1.next();
		String Ch = D1.next();
		
		for(String WindID: W1) {
			String Title =driver.switchTo().window(WindID).getTitle();
			
			System.out.println(Title);
			
			if(Title.equalsIgnoreCase("OrangeHRM")|| Title.equals("Test")) {
				
			}
			driver.switchTo().window(Ch);

			driver.findElement(By.name("EmailHomePage")).sendKeys("abc@gmail.com");
			
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
		}
		
		

	}

}
