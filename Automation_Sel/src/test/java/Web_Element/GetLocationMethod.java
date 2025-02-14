package Web_Element;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocationMethod {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Point Text1 = driver.findElement(By.xpath("(//a[@class=\"nav-a \"])[2]")).getLocation();
		System.out.println(Text1);
		//GetTagname
		String Text =driver.findElement(By.xpath("(//a[@class=\"nav-a \"])[2]")).getTagName();

		System.out.println(Text);
	}

}
