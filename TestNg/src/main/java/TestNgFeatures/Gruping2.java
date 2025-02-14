package TestNgFeatures;

import org.testng.annotations.Test;

public class Gruping2 {

	@Test(groups = "Smoke")
	public void Test1() {
	System.out.println("Program1");
	}
	@Test(groups = "Smoke")
	public void Test2() {
	System.out.println("Program2");
	}
	@Test(groups = "Regression")
	public void Test3() {
	System.out.println("Program3");
}
}
