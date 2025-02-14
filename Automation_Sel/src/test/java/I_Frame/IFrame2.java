package I_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
//Problem line 25 &26 $  39 X path ?
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
				
		WebElement OuterFrame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));		
		driver.switchTo().frame(OuterFrame);
		
		WebElement Text = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]"));
		String T1 = Text.getText();
		
		if(T1.equals("Nested iFrames")) {
			
			System.out.println("Text is correct");
		}else {
			System.out.println("Text is not correct");

	}
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

				driver.switchTo().frame(innerframe);
				WebElement Text2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));

				Text2.sendKeys("Automation testing");
				driver.switchTo().parentFrame();
				
				String T2 = Text.getText();
				System.out.println(T2);
				
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	

}
}
