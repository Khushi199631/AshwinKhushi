package ParalleTesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void SetUp(String Browsername) {
	if (Browsername.equals("Chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	} 
	
	else if (Browsername.equals("FireFox")) {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	}
	
	else if (Browsername.equals("Safari")) {
	WebDriverManager.safaridriver().setup();
	driver = new SafariDriver();
	}
	
	else if (Browsername.equals("IE")) {
	WebDriverManager.iedriver().setup();
	driver = new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	WebElement ele1 =driver.findElement(By.name("username"));
	ele1.sendKeys("Admin");
	WebElement ele2=driver.findElement(By.name("password"));
	ele2.sendKeys("admin123");

	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Boolean Test=driver.findElement(By.xpath("//h6[@class=\"oxd-textoxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")).isDisplayed();

	Assert.assertTrue(Test);
}
}
