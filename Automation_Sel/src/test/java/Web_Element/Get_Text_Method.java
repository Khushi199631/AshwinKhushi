package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Text_Method {

	public static void main(String[] args) {

		String str = "Create a Page for a celebrity, brand or business.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String Text =driver.findElement(By.id("reg_pages_msg")).getText();
		System.out.println(Text);
		if(str.equals(Text)) {
		System.out.println("Correct text");
		}


		else {
		System.out.println("Incorrect text");
		}
		driver.close();
	}

}
