package MultipleLInks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testphp.vulnweb.com/");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		int brokenlink = 0;
		for (WebElement element : Links) {
		String url = element.getAttribute("href");
		if (url == null || url.isEmpty()) {
		System.out.println("URL is empty");
		}
		
		URL link = new URL(url);
		HttpURLConnection httpcode = (HttpURLConnection)
        link.openConnection();

		httpcode.connect();
		if (httpcode.getResponseCode() >= 400) {
		System.out.println(httpcode.getResponseCode() + "-->" +url + " Is broken link");

		brokenlink++;
		} else {
		System.out.println(httpcode.getResponseCode() + "-->" +url + " Is valid link");
		}
		}
		System.out.println("Number of broken links " + brokenlink);

		driver.close();
}
}