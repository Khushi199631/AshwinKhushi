package ListBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox6 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement Listbox =driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(Listbox);
		
		select.selectByVisibleText("Swift");
		select.deselectByIndex(2);
		select.deselectByValue("Hyundaix");
		
		driver.close();
	}

}
