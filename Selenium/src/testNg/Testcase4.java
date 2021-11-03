package testNg;

import org.testng.annotations.Test;

//we can give priority for test cases
//default priority is zero
//lowest priority will execute first, if priority is not given or priorities are same--
//--execution is in alphabetical order
//we can give negative priority
public class Testcase4 {
	@Test(priority = 0)
	public void a1() {
		System.out.println("hi");
	}
	@Test(priority = -1)
	public void b1() {
		System.out.println("hello");
	}
	@Test(priority = 2)
	public void c1() {
		System.out.println("hheyy");
	}

}
