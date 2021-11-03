package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesourceAndCurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		//getting the source code of the webpage
		/*
		 * String actualPagesourceCode = driver.getPageSource();
		 * System.out.println(actualPagesourceCode);
		 */
		//getting the url of the webpage
        String actualUrl=driver.getCurrentUrl();
        System.out.println(actualUrl);
        
		driver.quit();
	}
}
