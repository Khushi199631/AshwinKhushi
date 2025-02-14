package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot3{
	static WebDriver driver;  //Static method i.e Static nhi to error ayanga
	
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();   //Yaha ka webdriver remove kro nhi to error ayanga
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		String Test ="Facebook";
		
		ScreenShot3.TakeScreenshot(Test);
		ScreenShot3.TakeScreenshot(Test);
		 driver.close();
		
	}
	public static void TakeScreenshot(String Text) throws IOException {
		
	String Random=	RandomString.make(10);
	
File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//Driver Main Method ke bhar hai is lie global dlecare karo
	
File S1 = new File ("C:/Users/Ashwin89/eclipse-workspace/Automation_Sel/Screenshots"+Random+".jpg");

 FileUtils.copyDirectoryToDirectory(Source, S1);
 
 driver.close();
 



	}

}
