package TestNgFeatures;

import org.testng.annotations.Test;

public class Gruping4 {

	@Test(groups = { "Login", "smoke" })
	public void Testuserlogin() {
	System.out.println("Login test case");
	}
	
	@Test(groups = { "search", "Regression" })
	public void Productsearch() {
	System.out.println("Productsearch case");
	}
	
	@Test(groups = { "cart", "Regression" })
	public void addcart() {
	System.out.println("add cart test case");
	}
	
	@Test(groups = { "checkout", "Regression" })
	public void checkoutprocesss() {
	System.out.println("checkoutprocesss test case");
	
}

}