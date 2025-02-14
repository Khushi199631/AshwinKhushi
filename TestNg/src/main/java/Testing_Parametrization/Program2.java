package Testing_Parametrization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program2 {

	@Parameters({"a","b"})
	@Test
	public void add(int a,int b) {
	int sum = a+b;
	System.out.println(sum);
	}
	@Parameters({"a","b"})
	@Test
	public void sub(int a,int b) {
	int sub = a-b;
	System.out.println(sub);
	}
	@Parameters({"a","b"})
	@Test
	public void div(int a,int b) {
	int div = a/b;
	System.out.println(div);
}
}
