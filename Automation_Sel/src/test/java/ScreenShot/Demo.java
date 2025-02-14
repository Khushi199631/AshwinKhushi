package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Demo {

	public static void main(String[] args) throws IOException {

		//4 Taking Screenshot of webpage
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		String IMGName = "Khushi";
		
		String R1 = RandomString.make(7);
		File F1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File F2 = new File("//C://Users//Ashwin89//Desktop//14 SEP//" + IMGName + R1 +".jpg");
		
		FileHandler.copy(F1, F2);
		
	
	
	}

}
