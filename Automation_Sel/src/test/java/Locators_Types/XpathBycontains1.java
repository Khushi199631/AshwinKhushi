package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBycontains1 {

	public static void main(String[] args) {

		//Xapth by conatin
		/**
		*
		* Text - //tagname[text()="value"]
		* ContainsByText = //tagname[contains(text(),"value")]
		* contiansByattribute
		*/
		//Step 1
		WebDriverManager.chromedriver().setup();
		//Step 2
		WebDriver driver = new ChromeDriver();

		//Step 3
		driver.get("https://www.facebook.com/");
		//Step 4
		driver.manage().window().maximize();
		//Step 5
		String Text =driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")).getText();

		System.out.println(Text);if(Text.equals("Facebook helps you connect and sharewith the people in your life.")) {

		System.out.println("Correct text");
		}
		else {
		System.out.println("Incorrect text");
		}
		}
		
		
		
	}


