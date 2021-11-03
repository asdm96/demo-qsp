package testNg;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups= {"regressionTestcase"})
	public void sample3() {
		System.out.println("this is regresion testcase2");
		
	}
	@Test(groups= {"smokeTestCase"})
	public void sample4() {
		System.out.println("this is smoke testcase2");
	}
}
