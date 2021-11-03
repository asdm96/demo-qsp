package testNg;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups= {"smokeTestCase","regressionTestcase"})
	public void sample() {
		System.out.println("this is smoketestcase 1");
	}
	@Test(groups={"regressionTestcase"})
	public void sample1() {
		System.out.println("this is regresion testcase1");
	}

}
