package Listeners_in_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithRetryy {

	@Test
	public void TestMethod3 () {
	System.out.println("Execting test method1 ");
	Assert.assertTrue(false,"Failed in testmethod 3");
	}
	@Test
	public void TestMethod4() {
	System.out.println("Execting test method1 ");
	Assert.assertTrue(true,"Failed in testmethod 4");
}
}