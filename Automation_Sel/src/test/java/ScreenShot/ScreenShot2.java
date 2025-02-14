package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		String ImgName = "Kitezeroda";
		
		String Random =RandomString.make(7); //Agar 2&3 SC Save karna ho to ye use karna
		//Random String create hongi
		
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File  S1 = new File("C:/Users/Ashwin89/Desktop/14 SEP"+ImgName +"_"+Random+".jpg");// Random Memory
	 //File  S1 = new File("src/test/resources"); 

	 
	 FileHandler.copy(scr, S1);
	 driver.close();
	 
		
		
		
		
	}

}
