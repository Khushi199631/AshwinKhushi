package TestNgFeatures;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(invocationCount = 10, enabled = false, priority = 1)
	public void name() {
	System.out.println("Autoamtion");
}
}