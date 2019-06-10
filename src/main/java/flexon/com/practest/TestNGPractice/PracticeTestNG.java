package flexon.com.practest.TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("in before test");
	}

	@BeforeClass
	public void testBeforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test(priority = 0)
	public void test1() {
		System.out.println("this iis my first test NG method");
	}

	@AfterClass
	public void testAfterClass() {
		System.out.println("after class");
	}

	@Test()
	public void testMethod2() {
		System.out.println("in second testNG method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("in after test");
	}
}

//group the test cases on type of test, testNG.xml
// @Test(enabled=false) skip test
// listeners=interface from testNG lib, and it lets us modify behavior
// test NG framework automates our test cases
//beforeSuite and afterSuite