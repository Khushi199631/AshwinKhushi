package Listeners_in_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void TestMethod1() {
	System.out.println("Execting test method1 ");
	Assert.assertTrue(false,"Failed in testmethod 1");
	}
	@Test
	public void TestMethod2() {
	System.out.println("Execting test method1 ");
	Assert.assertTrue(true,"Failed in testmethod 1");
}
}
