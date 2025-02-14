package ParalleTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalleTestExample {
	WebDriver driver;
	@BeforeClass
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	@Test
	public void testMethod1() {
	driver.get("https://www.facebook.com/");
	}

	@Test
	public void testmethod2() {
	driver.get("https://www.orangehrm.com/");
	}
	@Test
	public void testmethod3() {
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test
	public void testmethod4() {
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	@BeforeClass
	public void Teardown() {
	driver.quit();
}
}
