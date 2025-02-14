package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnable_Method3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		boolean test = driver.findElement(By.xpath("//div[@class=\"col-md-8 col-xs-8col-sm-8\"]")).isEnabled();
		WebElement Ele = driver.findElement(By.xpath("//div[@class=\"col-md-8 col-xs-8col-sm-8\"]"));

		boolean B1 = Ele.isEnabled();
		System.out.println(B1);
		//System.out.println(test);
	}

}
