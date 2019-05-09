package lambdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;
	public static JavascriptExecutor js = null;
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		//driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		element.click();
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}

	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
	}

	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		return element;
	}
	
	public static void fillDepartureDate(WebDriver driver, String departureDate) {
		element = departureDateTextBox(driver);
		element.sendKeys(departureDate);
	}

	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		return element;
	}
	
	public static void fillReturnDate(WebDriver driver, String returnDate) {
		element = returnDateTextBox(driver);
		element.sendKeys(returnDate);
	}
	
	public static JavascriptExecutor test(){
		WebDriver driver = null;
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = ''; ", returnDateTextBox(driver));
		return js;
	}

	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@class='gcw-form flights gcw-prepopulate-flying-from gcw-grey-out-irrelevant-dates flexible-shopping-form gcw-traveler-selector gcw-oneway-packages gcw-lessThanNTravelers-travelerSelector gcw-unattendedInfantInLap-travelerSelector gcw-childAgesAllProvided-travelerSelector gcw-allFlightsComplete gcw-allOriginsAreDifferentFromDestinations gcw-dynamic-leg-fields field-border-in-high-contrast-mode ess-passthrough-disabled']//button[@type='submit']"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	public static WebElement findText(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='title-city-text']"));
		return element;
	}	
	
}
