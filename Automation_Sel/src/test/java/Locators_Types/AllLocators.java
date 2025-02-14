package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLocators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//1.Xpath

		driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("Virajvelocity@gmail.com");

		driver.findElement(By.xpath("//input[contains(@name,\"signin\")]")).click();
		//2. ID

		driver.findElement(By.id("login-username")).sendKeys("Test@gamil.com");

		driver.findElement(By.id("login-signin")).click();
		//3.Classname

		driver.findElement(By.className("phone-no")).sendKeys("test@gmail.com");

		driver.findElement(By.className("pure-button")).click();
		//4.Tagname --- NA
		//5.Name
		driver.findElement(By.name("username")).sendKeys("R@gmal.com");
		driver.findElement(By.name("signin")).click();
		//6.USerName - LinkText - NA
		//7.Next - PartialLinkText
		driver.findElement(By.linkText("Forgotten username?")).click();
		driver.findElement(By.partialLinkText("Forgotte")).click();
		//CSS

		driver.findElement(By.cssSelector("#login-username")).sendKeys("Test@gmail.com");

		//input#login-username
		//[name="username"]
		//input[name="username"]
		//input.phone-no
	}

}
