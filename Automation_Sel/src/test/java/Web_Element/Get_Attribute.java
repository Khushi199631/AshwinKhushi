package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Attribute {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		
		WebElement FN = driver.findElement(By.id("id=\"FirstName\""));
		WebElement LN = driver.findElement(By.id("id=\"LastName\""));
		WebElement EM = driver.findElement(By.id("id=\"Email\""));
		WebElement PS = driver.findElement(By.name("\"Password\""));
		WebElement CP = driver.findElement(By.id("id=\"ConfirmPassword\""));
		
		String Get_Attrbute_LastN =LN.getAttribute("data-val-required");
		
		System.out.println("Get_Attrbute_LastName ==" + Get_Attrbute_LastN);
		
		if(Get_Attrbute_LastN.equals("Last name is required")) {
			System.out.println("Expected text is present");
		}
		
		FN.sendKeys("KHUSHI");
		LN.sendKeys("Share");
		EM.sendKeys("testknowledgeshare@gmail.com");
		PS.sendKeys("123456");
		CP.sendKeys("123456");
		
		driver.close();
	}

}
