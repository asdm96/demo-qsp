package webdriverMethods;

import org.openqa.selenium.WebDriver;

public class Flipkart {
	
	public static void Factory(WebDriver driver) {
		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
