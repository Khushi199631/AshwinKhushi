package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Imagename ="Facebook";
		File S2 = new File("/C:/Users/Ashwin89/Desktop/14 SEP/"+Imagename+".jpg");
		
        FileHandler.copy(S1, S2);
        
        driver.close();
		
	}

}
