package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelWithDDF {

		// TODO Auto-generated method stub
		// Excel sheet,config file, Property file
		// Step 1


		// POM + PageFacory
		@FindBy(id = "email")
		private WebElement UserName;
		@FindBy(id = "pass")
		private WebElement Password;
		// Step 2
		public PageObjectModelWithDDF (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		// step 3
		public void Username1(String Name) {
		UserName.sendKeys(Name);
		}
		public void UserPass(String Name) {
		Password.sendKeys(Name);
	}

}
