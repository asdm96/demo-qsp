package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetTheWindowSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		Dimension dimension = new Dimension(500, 600);
		driver.manage().window().setSize(dimension);
		
		driver.quit();
		

	}

}
