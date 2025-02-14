package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassorBaseClass {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//

	FaceBook_Login_TC1 F1 = new FaceBook_Login_TC1(driver);

	//

	F1.OpenApplication();
	// F1.UserName("Test@123");
	// F1.PassWord("TEst12");
	// F1.FacebookLoginButton();

	FaceBook_CreatAccount_Tc2 FC = new

	FaceBook_CreatAccount_Tc2(driver);
	F1.Create_Account();
	FC.FirstName("Rohit");
	FC.LatName("Patil");
	FC.GN();
	FC.RegEmail("Test@1234");
	FC.RegPass("TTTt@122");
	FC.Signup();
}
}