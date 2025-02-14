package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        JavascriptExecutor Js = (JavascriptExecutor)driver;
        // Js.executeScript("window.scrollBy(8000, 0)", "");//Scroll down
        Js.executeScript("window.scrollBy(0,4000)","");
		Thread.sleep(5000);

		Js.executeScript("window.scrollBy(0, -2000)", ""); //scrollUp
		Thread.sleep(5000);
		driver.quit();
	}

}
