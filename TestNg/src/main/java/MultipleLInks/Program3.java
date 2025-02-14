package MultipleLInks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.hc.core5.http.io.HttpClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException,IOException {

	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--headless");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.deadlinkcity.com/");
	// find all links and images
	List<WebElement> Links = driver.findElements(By.tagName("a"));
	Links.addAll(driver.findElements(By.tagName("img")));
	System.out.println("Total links including images --> " +Links.size());

	List<WebElement> ActiveLinks = new ArrayList();
	int brokeLinkscount = 0;
	for (WebElement link : Links) {
	try {
	String href = link.getAttribute("href");
	if (href != null && !href.contains("javascript")) {

		ActiveLinks.add(link);
	}
	} catch (StaleElementReferenceException e) {
	System.out.println("Staleelement excpetion occured :skipping this link");
	}
	}
	System.out.println("Active links : " + ActiveLinks.size());
	for (WebElement activelink : ActiveLinks) {
	try {
	String url = activelink.getAttribute("href");
	HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

	connection.connect();
	int statuscode = connection.getResponseCode();
	if (statuscode >= 400) {
	System.out.println("Broken link ---> [Status code:" + statuscode + "] URL : " + url);

	brokeLinkscount++;
	} else {
	System.out.println("Valid link ---> [Status code:" + statuscode + "] URL : " + url);

	}
	} catch (Exception e) {
	System.out.println("Error checking link :" +activelink.getAttribute("href"));

	}
	}
	System.out.println("NUmber of broken links : " + brokeLinkscount);
}
}