package Testing_Parametrization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	WebDriver driver;
	@Parameters({"URL"})
	@BeforeMethod
	public void SetUp(String URL) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(URL);
	}

	@Parameters({ "USERNAME", "PASSWORD", "EXPRESULT" })
	@Test
	public void LoginTest(String UN, String PW, String Expresult) {
	WebElement Username = driver.findElement(By.id("email"));
	Username.sendKeys(UN);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(PW);
	String Title = driver.getTitle();
	if (Title.equals(Expresult)) {
	System.out.println("Correct title");
	} else {
	System.out.println("Incorrect title");
}
}
	
	
@AfterMethod
public void Teardown() {
driver.quit();
}
}