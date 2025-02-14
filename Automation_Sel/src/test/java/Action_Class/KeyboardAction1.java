package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction1 { 

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
       // Step 2
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		WebElement input1 = driver.findElement(By.id("email"));
		WebElement input2 = driver.findElement(By.id("pass"));
		input1.sendKeys("Test@gmail.com");
		Actions act = new Actions(driver);
		// CTRL + A - Windows
		// Command + A - MAC
		// Select all data
		//act.keyDown(Keys.COMMAND); // MAC

		act.keyDown(Keys.CONTROL); //Windows
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
        // act.keyUp(Keys.COMMAND);
		
		act.doubleClick(input1);
		act.contextClick();
		act.build().perform();

		
		// CTRL + C //CMD + c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();

		// Tab
		act.keyDown(Keys.TAB);
		act.build().perform();
		
		// CTRL + V
		act.keyDown(Keys.COMMAND);
		act.sendKeys("v");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
		//driver.findElement(By.xpath("//div[@class=\"_9lsb_9ls8\"]")).click();
		
		
		// compare text
        String T1 = input1.getAttribute("value");
		String T2 = input2.getAttribute("value");
		if (T1.equals(T2)) {
		System.out.println("Correct text");
		}
		else {
		System.out.println("Incorrec text");
		}
	}

}
