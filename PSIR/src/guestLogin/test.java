package guestLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
	}
}
