package TestNgFeatures;

import org.testng.annotations.Test;

public class Gruping1{

	public class Program1 {
		// Smoke/sanity regression groups
		@Test(groups = "Smoke", enabled = true)
		public void Test1() {
		System.out.println("Program11");
		}
		@Test(groups = "Regression")
		public void Test2() {
		System.out.println("Program22");
		}
		@Test(groups = "Regression")
		public void Test3() {
		System.out.println("Program33");
}
}
}