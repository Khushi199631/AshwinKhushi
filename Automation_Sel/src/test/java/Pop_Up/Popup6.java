package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Not Understand
public class Popup6 {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		System.out.println("Test case completed");
	}

}
