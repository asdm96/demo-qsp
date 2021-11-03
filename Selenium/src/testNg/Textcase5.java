package testNg;

import org.testng.annotations.Test;
//disable the test case
public class Textcase5 {
	@Test(enabled = false)
	public void a1() {
		System.out.println("hi");
	}
	@Test(invocationCount = 0)
	public void b1() {
		System.out.println("hello");
	}
	@Test()
	public void c1() {
		System.out.println("heyy");
	}

}
