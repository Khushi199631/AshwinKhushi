package FindElement_Elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement A1 = driver.findElement(By.id("twotabsearchtextbox"));
		A1.sendKeys("IPhone");
		
	List< WebElement>LI = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));

				System.out.println(LI.size()); //10

	List< WebElement>LI1 = driver.findElements(By.xpath("//div[@class=\"s-suggesrty-container\"]"));

				System.out.println(LI1.size()); //10
	}

}
