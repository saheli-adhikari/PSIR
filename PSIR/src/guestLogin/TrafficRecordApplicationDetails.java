package guestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrafficRecordApplicationDetails {
	public static WebElement element = null;

	// returns the application form button
	public static WebElement applicationFormButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Application Form')]"));
		return element;
	}

	// clicks on application form button
	public static void clickApplicationFormButton(WebDriver driver) {
		element = applicationFormButton(driver);
		element.click();
	}

	// returns the search button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Proceed to Search, if approved')]"));
		return element;
	}

	// clicks on search button
	public static void enterPasswordTextBox(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}

}
