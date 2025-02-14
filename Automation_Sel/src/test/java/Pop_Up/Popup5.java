package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		
		driver.findElement(By.id("login1")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		
		Alert A1 = driver.switchTo().alert();
		String A2 =A1.getText();
		String Text ="Please enter your password";
		
		if(A2.equals(Text)) {
			System.out.println("Correct Text");
		}else {
			System.out.println("InCorrect Text");

		}
	}

}
