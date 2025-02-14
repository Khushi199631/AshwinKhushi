package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Login_TC1 {

	
	
	WebDriver driver;
	// WebDriver driver = new ChromeDriver();
	// @FindBy(xpath = "//input[@name=\"username\"]") private WebElement Username;
	
	public void OpenApplication() {
		driver.get("https://www.facebook.com/");
		}
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@name=\"login\"]")
	private WebElement Login_Button;
	
	@FindBy(xpath = "//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")
	private WebElement Create_Account;
	
	@FindBy(xpath = "//img[@class=\"fb_logo _8ilh img\"]")
	private WebElement FacebookLogo;
	
	//Step 2
	public FaceBook_Login_TC1(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	//Step 3
	public void UserName(String Name) {
		username.sendKeys(Name);
	}
	public void PassWord(String Pass) {
	Password.sendKeys(Pass);
	}
	public void FacebookLoginButton() {
	Login_Button.click();
	}
	public void Create_Account() {
	Create_Account.click();
	}
	
	public void FaceBookLogo() {
	boolean Test = FacebookLogo.isDisplayed();
	if (Test) {
	System.out.println("Logo dispalyed");
	} else {
	System.out.println("Logo is not dsiplayed");
	}
	}
	
	

}