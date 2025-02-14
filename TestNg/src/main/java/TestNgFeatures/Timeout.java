package TestNgFeatures;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 15000)

	public void LoginTest() {
	for (;;) {
	System.out.println("Hello");
}
}
}