package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//problem
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Login/ Sign Up']")).click();
		driver.findElement(By.xpath("//label[@for=\"multiform\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[@for=\"multiform\"]")).sendKeys("TEst@gmail.com");
        driver.findElement(By.xpath("//div[@class=\"absolute top-0right-0\"]")).click();
				driver.close();
	}

}
