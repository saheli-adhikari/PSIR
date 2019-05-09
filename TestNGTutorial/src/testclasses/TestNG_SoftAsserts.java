package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClasstoTest;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {
	
	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		SomeClasstoTest obj = new SomeClasstoTest();
		int result = obj.SomeNumber(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("Line after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("Line after assert 2");
		sa.assertAll();
		
	}
}
