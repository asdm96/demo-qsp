package testNg;

import org.testng.annotations.Test;
//creating dependency between test cases
//failure of one test case will lead to skipping of dependent test cases
public class Testcase7 {
	@Test()
	public void login() {
		System.out.println("hi");
		throw new ArithmeticException();
	}
	@Test(dependsOnMethods = "login")
	public void cart() {
		System.out.println("hello");
	}
	@Test(dependsOnMethods = "cart")
	public void logout() {
		System.out.println("heyy");
	}
}
