package guestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userApplication {
	public static WebElement element = null;
	
	// returns first name
	public static WebElement applicationFormButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Application Form')]"));
		return element;
	}

	// enters first name
	public static void clickApplicationFormButton(WebDriver driver) {
		element = applicationFormButton(driver);
		element.click();
	}

}
