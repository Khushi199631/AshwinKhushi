package ListBox_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
Thread.sleep(2000);
		
		List<WebElement> W1 = driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));

		for(int i =0;i<W1.size();i++){
		String A1 =W1.get(i).getText();
		System.out.println(A1);
		}	
		
		


	
	}
}
