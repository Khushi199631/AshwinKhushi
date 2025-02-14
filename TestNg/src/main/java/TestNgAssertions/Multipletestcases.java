package TestNgAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Multipletestcases {

	SoftAssert softassert = new SoftAssert();
	@Test
	public void Testmethod1() {
	System.out.println("Executing test method 1");
	softassert.assertEquals(10, 10, "TestMethod 1 : First assertionfailed"); //T

	softassert.assertTrue(10 > 5, "TestMethod 1 : Second assertionfailed"); //T
	}
	@Test
	public void Testmethod2() {
	System.out.println("Executing test method 2");
	softassert.assertEquals("Hello", "hello", "TestMethod 2 : Firstassertion failed"); //F

	softassert.assertFalse(5 > 10, "TestMethod 2 : Second assertionfailed"); //T
	}
	@Test
	public void Testmethod3() {
	System.out.println("Executing test method 3");
	softassert.assertEquals("Hello", "hello", "TestMethod 2 : Firstassertion failed");//F

	softassert.assertFalse(5 < 10, "TestMethod 3 : Second assertionfailed"); //T
	}
	@Test(dependsOnMethods = {"Testmethod1","Testmethod2","Testmethod3"})
	public void CollectioAssertion() {
	System.out.println("Collection all assertion results");
	softassert.assertAll();
}
}
