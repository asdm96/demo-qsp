package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase11 {
	@Test
	public void soft() {
		//soft assert
		String expectedTitle="qspiders";
		String actualTitle="qspi";
		//all are non static method in softAssert class
		//call assertAll method to view/fail the testcases
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertAll();
	}

}
