package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleWithoutDDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1
		WebDriverManager.chromedriver().setup();
		// Step 2
		WebDriver driver = new ChromeDriver();
		// Step 3
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Enter username
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		// Enter password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String Text = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")).getText();

		if (Text.equals("Dashboard1")) {
		System.out.println("Login successfully");
		} else {
		System.out.println("Incorrect Dasboard name");
		}
		driver.quit();
	}

}
