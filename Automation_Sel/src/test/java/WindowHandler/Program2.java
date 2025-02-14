package WindowHandler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.StringArray;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		Thread.sleep(5000);

		String A1 =driver.getWindowHandle();
		System.out.println(A1);
		// It is use ti store only curent window IDs in the formof string

		//2 Get Window Handles
		Set<String> D1 =driver.getWindowHandles();
		
		//Frist Way
		Iterator<String> D2 = D1.iterator();
		
		String Parent =D2.next();
		String Child =D2.next();
		
		System.out.println(Parent);
		System.out.println(Child);
		
		driver.switchTo().window(Child);
		
//		//Second Way
//		List<String>  W1 =new ArrayList<String>(D1);
//		
//		String Parent = W1.get(0);
//		String Child = W1.get(1);
//
//		driver.switchTo().window(Child);
//		
//		String Title = driver.getTitle();
//		System.out.println(Title);
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.switchTo().window(Parent);
		driver.close();
	}

}
