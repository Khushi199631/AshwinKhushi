package I_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame3 {

	public static void main(String[] args) {
	        //problem
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
			driver.manage().window().maximize();

			driver.switchTo().frame("iframeResult");
			
			String Text=driver.findElement(By.xpath("//h2[contains(text(),'HTMLIframes')]")).getText();
					System.out.println(Text);
					driver.switchTo().frame(0);
			String T2=driver.findElement(By.xpath("//h1[contains(text(),'This pageis displayed in an iframe')]")).getText();
					System.out.println(T2);
					driver.switchTo().defaultContent();
					driver.findElement(By.id("runbtn")).click();
					driver.switchTo().alert();			
			
			
	}

}
