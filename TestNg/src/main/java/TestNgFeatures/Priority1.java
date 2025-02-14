package TestNgFeatures;

import org.testng.annotations.Test;

public class Priority1 {

		// TODO Auto-generated method stub
		// @BeforeClass
		// public void SetUp() {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// }
		@Test(priority = 1)
		public void AC() {
		System.out.println("JK");
		}
		
		@Test(priority = 1)
		public void AA() {
        System.out.println("AD");
		}
		
		@Test(priority = 1)
		public void AB() {
		System.out.println("SR");
		}
		//
		// @AfterClass
		// public void Teardown() {
		//
		// driver.quit();
		// }
	}


