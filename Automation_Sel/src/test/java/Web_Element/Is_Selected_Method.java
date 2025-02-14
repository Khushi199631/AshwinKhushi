package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected_Method {

	public static void main(String[] args) throws InterruptedException
	{//IsSelected method is only applicable for checkbox ,dropdown,radiobutton
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement FN = driver.findElement(By.id("id=\"FirstName\""));
		WebElement LN = driver.findElement(By.id("id=\"LastName\""));
		WebElement EM = driver.findElement(By.id("id=\"Email\""));
		WebElement PS = driver.findElement(By.name("\"Password\""));
		WebElement CP = driver.findElement(By.id("id=\"ConfirmPassword\""));
		
		
		
		FN.sendKeys("KNOWLEDGE");
		LN.sendKeys("SHARE");
		EM.sendKeys("testknowledgeshare@gmail.com");
		PS.sendKeys("123456");
		CP.sendKeys("123456");
		
	}

}
