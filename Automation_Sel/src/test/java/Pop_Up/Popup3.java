package Pop_Up;

import java.awt.PopupMenu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		
		String str = "You clicked: Ok";
		
        Alert popup = driver.switchTo().alert();
		Thread.sleep(5000);

		popup.accept();
String Text= driver.findElement(By.id("result")).getText();	
		
		if(str.equals(Text)) {
			System.out.println("Correct Text");
		}else {
			System.out.println("InCorrect Text");

		}
		
        
	}

}
