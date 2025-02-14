package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnable_Method {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		boolean b1 = driver.findElement(By.id("register-button")).isEnabled();//Enble = True ///Disable = False
		
        System.out.println("register-button is Enable ==" + b1);
        
        driver.close();
				
	}

}
