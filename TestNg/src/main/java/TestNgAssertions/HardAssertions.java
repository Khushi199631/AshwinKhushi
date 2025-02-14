package TestNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	public void Test1() {
	System.out.println("Program started");
	boolean actualResult = false;
	Assert.assertTrue(actualResult, "Assertion failed : value should be true");
	System.out.println("Program completed");  //Failed
	}
	
	@Test
	public void Test2() {
	System.out.println("Program started");
	boolean actualResult = false;
	Assert.assertFalse(actualResult, "Assertion failed : value should be true");
	System.out.println("Program completed");//Pass
	}
	
	@Test
	public void Test3() {
	System.out.println("Program started");
	String S1 = "Java";
	String S2 = "Java";
	String S3 = "Python";

	Assert.assertEquals(S1, S2, "AssertEqual Failed : Expected Java but found 'python'");
	Assert.assertEquals(S1, S3, "AssertEqual Failed : Expected Java but found 'python'");
	System.out.println("Program completed");//Failed
	}

	@Test
	public void Test4() {
	System.out.println("Program started");
	String S1 = "Java";
	String S2 = "Java";
	String S3 = "Python";
	Assert.assertNotEquals(S1, S3, "AssertEqual Failed : Expected Java but found'python'");

	Assert.assertNotEquals(S1, S2, "AssertEqual Failed : Expected Java but found'python'");
	//Failed
	System.out.println("Program completed");
}
}