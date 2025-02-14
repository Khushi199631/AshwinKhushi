package MultipleLInks;

import java.util.List;
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
		driver.get("https://www.facebook.com/");
		List<WebElement> List = driver.findElements(By.tagName("a"));
		System.out.println(List.size());
		for (WebElement ele : List) {
		System.out.println(ele.getText());
		System.out.println(ele.getAttribute("href"));
		}

	}
}