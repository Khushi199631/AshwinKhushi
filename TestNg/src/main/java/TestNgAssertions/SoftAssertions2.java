package TestNgAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions2 {

	@Test
	public void testforsoftassertion() {
	SoftAssert Assert = new SoftAssert();
	System.out.println("Step 1 : Verify first condition");
    Assert.assertEquals(10,50 ,"First assertion failed");  //F
	System.out.println("Step 2 : Verify second condition");
	Assert.assertTrue(10 > 50 ,"Second assertion failed"); //F
	System.out.println("Step 3 : Verify thirs condition");
	Assert.assertFalse("Java".isEmpty() ,"Third assertion failed"); //F
	System.out.println("Step 4 : Contining test execiton afterfailures");

	Assert.assertAll();
}
}