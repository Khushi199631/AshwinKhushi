package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByelement1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		WebElement Ele=driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));
		Js.executeScript("arguments[0].scrollIntoView();", Ele); //Yaha tk scrool honga
		
		Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Page end tk scroll honga
		
		Thread.sleep(5000);
		Js.executeScript("document.documentElement.scrollTop=0", "");
		driver.close();
	}

}
