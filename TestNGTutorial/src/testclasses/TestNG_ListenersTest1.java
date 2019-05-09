package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerspackage.CustomListener1;

@Listeners(CustomListener1.class)
public class TestNG_ListenersTest1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Code in before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Code in after class");
	}

	@Test
	public void testMethod1() {
		System.out.println("Code in test method 1");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("Code in test method 2");
		Assert.assertTrue(false);
	}
}
