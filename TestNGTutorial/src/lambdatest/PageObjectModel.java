package lambdatest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lambdatest.SearchPage;

public class PageObjectModel {
	public String baseURL;
	public String username = "saheli.adhikari";
	public String accesskey = "IrZWVlkRHljHFrP4USyoeQ5Gcm0qOzHAVKVtH1S0POVmCT0CHw";
	public RemoteWebDriver driver = null;
	public String gridURL = "@hub.lambdatest.com/wd/hub";
	boolean status = false;

	@BeforeClass
	@org.testng.annotations.Parameters(value = { "browser", "version", "platform" })
	public void setUp(String browser, String version, String platform) throws Exception {
		baseURL = "https://www.expedia.com/";

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("version", version);
		capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any
															// available one
		capabilities.setCapability("build", "LambdaTestSampleApp8");
		capabilities.setCapability("name", "LambdaTestJavaSample8");
		capabilities.setCapability("network", true); // To enable network logs
		capabilities.setCapability("visual", true); // To enable step by step screenshot
		capabilities.setCapability("video", true); // To enable video recording
		capabilities.setCapability("console", true); // To capture console logs
		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test1() {
		driver.get(baseURL);
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDepartureDate(driver, "06/01/2019");
		SearchPage.fillDestinationTextBox(driver, "Chicago");		
		SearchPage.returnDateTextBox(driver).clear();
		SearchPage.fillReturnDate(driver, "06/04/2019");
		SearchPage.clickOnSearchButton(driver);
	}
	
	public void test2() {
		String someText = SearchPage.findText(driver).getText();
            Assert.assertEquals(someText, "Select your departure to Chicago");
		}

	@AfterClass
	public void tearDown() throws Exception {
		 if (driver != null) {
	          ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
	          driver.quit();
	      }
	}
}
