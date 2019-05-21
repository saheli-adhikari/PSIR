package guestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element = null;

	// returns the user name text box
	public static WebElement usernameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='UserName']"));
		return element;
	}

	// enter user name
	public static void enterUsername(WebDriver driver, String username) {
		element = usernameTextBox(driver);
		element.sendKeys(username);
	}

	// returns the password text box
	public static WebElement passwordTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='Password']"));
		return element;
	}

	// enter password
	public static void enterPassword(WebDriver driver, String password) {
		element = passwordTextBox(driver);
		element.sendKeys(password);
	}

	// returns the login button
	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='btn-login']"));
		return element;
	}

	// clicks on login button
	public static void clickLoginButton(WebDriver driver) {
		element = loginButton(driver);
		element.click();
	}

	// returns forgot password button
	public static WebElement forgotPasswordButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()=' Forgot Password']"));
		return element;
	}

	// clicks on forgot password button
	public static void clickOnForgotpasswordButton(WebDriver driver) {
		element = forgotPasswordButton(driver);
		element.click();
	}

	// returns corporate registration button
	public static WebElement corpRegistrationButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Corporate Registration']"));
		return element;
	}

	// clicks on corporate registration
	public static void fillReturnDate(WebDriver driver) {
		element = corpRegistrationButton(driver);
		element.click();
	}

	// returns the guest login button element
	public static WebElement guestLoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Individual User Guest Login']"));
		return element;
	}

	// clicks on the guest login button element
	public static void clickGuestLoginButton(WebDriver driver) {
		element = guestLoginButton(driver);
		element.click();
	}

}
