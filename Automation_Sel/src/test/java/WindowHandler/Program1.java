package WindowHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		//Get Window Handle
		
		String WH = driver.getWindowHandle();
		
		System.out.println(WH);//CDwindow-E16CB34F41F9ED08FA2BDC6C5384AE7C

	}

}
