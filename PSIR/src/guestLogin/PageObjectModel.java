package guestLogin;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import guestLogin.LoginPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseURL;
	

	@BeforeClass
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	/*
	 * @Test public void test() { driver.get(baseURL);
	 * LoginPage.navigateToFlightsTab(driver); LoginPage.fillOriginTextBox(driver,
	 * "New York"); LoginPage.fillDestinationTextBox(driver, "Chicago");
	 * LoginPage.fillDepartureDate(driver, "04/01/2019"); //SearchPage.test();
	 * LoginPage.returnDateTextBox(driver).clear(); LoginPage.fillReturnDate(driver,
	 * "04/04/2019"); LoginPage.clickOnSearchButton(driver); }
	 */

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}
