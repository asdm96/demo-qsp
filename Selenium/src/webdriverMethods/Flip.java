package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flip {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
