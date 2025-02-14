package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//problem
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		driver.findElement(By.id("file-upload")).click();
		
		Alert A1 = driver.switchTo().alert();
	}

}
