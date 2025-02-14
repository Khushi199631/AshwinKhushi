package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot4 {

	public static void main(String[] args) throws IOException {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String ImgName ="Facebook";
		
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		System.out.println(Timestamp);
		
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File S2 = new File("\Users\Ashwin89\eclipse-workspace\Automation_Sel\Screenshots\");
		
		String path =".//Screenshots//";
		
		File S2 =new File(path+"_"+ImgName+"_"+Timestamp+".jpg");
		
        FileHandler.copy(S1, S2);
        
        driver.close();
		
	}

}
