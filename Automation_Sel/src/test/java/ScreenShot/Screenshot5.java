package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot5 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		String ImgName = "Kitezeroda";
		
		String Random= RandomString.make(7);
		
		String imageName = "Face";
		
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = "./";
		
		Path direction =Paths.get("src/test/resources");
		
		String Apath = direction.toFile().getAbsolutePath();
		
		System.out.println(Apath);
		
		File S2 = new File (Apath+"/Screenshots/"+imageName+"_"+Random);
		
		FileUtils.copyDirectory(S1, S2);
		
		driver.close();
		
	}

}
