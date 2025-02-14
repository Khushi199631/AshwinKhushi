package WindowHandler;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[@href=\"#Tabbed\"]")).click();

		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		String WinID = driver.getWindowHandle();
		System.out.println(WinID); //Parent window
		String Exp_Result = "Selenium automates browsers. That's it!";
		Set<String> IDs =driver.getWindowHandles(); //Pa ,child
		for(String WindIDs : IDs) {
		if(!WinID.equals(WindIDs)) {
		driver.switchTo().window(WindIDs);
		String Text = driver.findElement(By.xpath("//h1[@class=\"d-1 fw-bold\"]")).getText();

		if(Text.equals(Exp_Result)) {
		System.out.println("Child window correct text");
		}
		else {
		System.out.println("Incorrect text");
		}
		}
		}
		driver.switchTo().window(WinID);
		String ParentText =driver.findElement(By.xpath("//div[@align=\"center\"]")).getText();

		if(ParentText.equals("Automation Demo Site")) {
		System.out.println("Prent window correct text");
		}
		else {
		System.out.println("P incorrect text");
		}
		}

	}


