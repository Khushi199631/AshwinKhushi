package TestNgAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {

	@Test
	public void Test1() {
	System.out.println("Program started ");
	SoftAssert softassert = new SoftAssert();
	softassert.assertTrue(true);
	System.out.println("Program completed");
	// Collect all result and report failures at the end
	softassert.assertAll();
	}
	@Test
	public void Test2() {
	SoftAssert softassert = new SoftAssert();
	System.out.println("Program started ");
	softassert.assertEquals("Java", "Java");
	System.out.println("Program Completed ");
	softassert.assertAll();
}
}