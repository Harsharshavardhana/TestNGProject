package Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseclass {
@BeforeTest(alwaysRun=true)
	public void method3() {
	System.out.println("Inside before method3");
}
@AfterTest(alwaysRun=true)
public void method4() {
	System.out.println("Inside before method4");
}
@BeforeMethod(alwaysRun=true)
public void method1()
{
	System.out.println("Inside before method");
}
@AfterMethod(alwaysRun=true)
public void method()
{
	System.out.println("Inside after Smethod");
}
}
