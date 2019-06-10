package flexon.com.practest.TestNGPractice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		Assert.assertEquals("america", "american");
		
	}

}
