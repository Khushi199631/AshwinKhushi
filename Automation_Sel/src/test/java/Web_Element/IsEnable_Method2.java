package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnable_Method2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Ele =driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));
		boolean B1 = Ele.isEnabled();

	
		System.out.println(B1);
	}

}
