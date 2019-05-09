package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClasstoTest;

public class TestNG_Asserts {
	
	@Test
	public void testSum() {
		System.out.println("Running test -> testSum");
		SomeClasstoTest obj = new SomeClasstoTest();
		int result = obj.SomeNumber(1, 3);
		Assert.assertEquals(result, 4);
	}
	
	@Test
	public void testStrings() {
		System.out.println("Running test -> testStrings");
		String expectedString = "Hello World";
		SomeClasstoTest obj = new SomeClasstoTest();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays() {
		System.out.println("Running test -> testArrays");
		int[] expectedArray = {1, 2, 3, 4};
		SomeClasstoTest obj = new SomeClasstoTest();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
	}
}
