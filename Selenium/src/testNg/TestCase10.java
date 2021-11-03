package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase10 {
	//hard assert
	@Test
	public void Verification() {
		String expectedTitle="qspiders";
		String actualTitle="qspiders";
		
		boolean expectedflag=false;
		boolean actualflag=false;
		//hard assertion
		//all methods are static in Assert class
		//assertEquals method
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualflag, expectedflag);
		Assert.assertTrue(actualflag);
		
	}

}
