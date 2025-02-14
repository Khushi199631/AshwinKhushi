package TestNGAnnotations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation1 {

	WebDriver driver;
	// BeforeSuite ,BeforeTest, Beforeclass, BeforeMethod,@Test ,
	@AfterMethod
	// @AfterClass, @AfterTest , @AfterSuite
	@SuppressWarnings("deprecation")
	// Set up the webdriver and initialize browser each test
	
	@BeforeMethod
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	private void At() {
	String Title = driver.getTitle();
	System.out.println("Page title " + Title);
	System.out.println("Test case verifypagetitle");
	}
	
	@Test
	public void VeriftyLogpresence() {
	boolean islogodisplayed = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
    System.out.println("Is logo dispalyed " + islogodisplayed);
	System.out.println("Test case :VeriftyLogpresence");
	}
	
	@Test(enabled = true)
	public void Demo() {
	boolean islogodisplayed = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
    System.out.println("Is logo dispalyed " + islogodisplayed);
	System.out.println("Test case :Demo");
	}

	@AfterMethod
	public void TearDown() {
	driver.quit(); // Close the browser
}
}