package ParalleTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {

	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	@Test
	public void Testmethod1() {
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	@AfterMethod
	public void Teardonw() {
	driver.quit();
}
}
