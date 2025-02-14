package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		
		Alert popup = driver.switchTo().alert();
		Thread.sleep(5000);

		popup.sendKeys("Automation");
		
        String str = "You entered: Automation";
       String text = popup.getText();
       System.out.println(text);
       popup.accept();
       
       String Text= driver.findElement(By.id("result")).getText();	
		
		if(str.equals(Text)) {
			System.out.println("Correct Text");
		}else {
			System.out.println("InCorrect Text");

		}
		
		
	}

}
