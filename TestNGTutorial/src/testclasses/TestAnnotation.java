package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClasstoTest;

public class TestAnnotation {

	@Test
	public void testMethod1() {
		SomeClasstoTest obj = new SomeClasstoTest();
		int result = obj.SomeNumber(2, 3);
		System.out.println("Running test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running test -> testMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running test -> testMethod3");
	}
}
