package Testcase;

import org.testng.annotations.Test;

public class Homeloantest extends baseclass {

	@Test(dependsOnMethods = "test2")
	public void test1() {
		System.out.println("Inside home loan test1");
	}

	@Test(groups = { "Sanity", "regression" })
	public void test2() {
		System.out.println("Inside home loan test2");
	}
}
