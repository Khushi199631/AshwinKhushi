package FindElement_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// List<WebElement> Li=driver.findElements(By.xpath("//a[@class=\"_42ft_4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		//
		// System.out.println(Li.size());
WebElement Mobile=driver.findElement(By.id("twotabsearchtextbox"));
		Mobile.sendKeys("Iphone");

List< WebElement>LI = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));

		System.out.println(LI.size()); //10

List< WebElement>LI1 = driver.findElements(By.xpath("//div[@class=\"s-suggesrty-container\"]"));

		System.out.println(LI1.size()); //10
		
//	List<WebElement> As=	driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
//	System.out.println(As.size());
		}
		
	
}