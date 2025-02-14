package TestNgFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gruping3 {

	WebDriver driver;
	@BeforeClass
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openapplication() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(groups = "LoginPage")
	public void logo() {
   driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
}
	
	@Test(groups = "LoginPage")
	public void Verifyusernameanspassword() {
	driver.findElement(By.name("username")).isDisplayed();
	driver.findElement(By.name("password")).isDisplayed();
	}
	
	@Test(groups = "Homepage")
	public void Homepage() {
	System.out.println("Homepage");
	}
	@Test(groups = "Dashboard")
	public void Dashbord1() {
	System.out.println("Dashbord1");
	}
	@Test(groups = "Dashboard")
	public void Dashbord2() {
	System.out.println("Dashbord2");
	}
	@AfterClass
	public void teardown() {
	driver.quit();
}
}