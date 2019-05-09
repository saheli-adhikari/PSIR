package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nBaseTestSuite -> Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nBaseTestSuite -> After Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("\nBaseTestSuite -> Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("\nBaseTestSuite -> After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nBaseTestSuite -> Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBaseTestSuite -> After Suite");
	}

}
