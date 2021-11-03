package webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnottherUrl {

	public static void main(String[] args) throws MalformedURLException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		URL url = new URL("https://www.flipkart.com");
		driver.navigate().to(url);
		//driver.quit();

	}

}
