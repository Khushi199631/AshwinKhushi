package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement Src = driver.findElement(By.id("box3"));
		WebElement dest = driver.findElement(By.id("box103"));
		WebElement src1 = driver.findElement(By.id("box6"));
		WebElement dest1 = driver.findElement(By.id("box106"));
		Actions Act = new Actions(driver);
		Act.dragAndDrop(Src, dest).perform();
		Act.dragAndDrop(src1, dest1).build().perform();
		// h5[contains(text(),'High Tatras 2')]
	}

}
