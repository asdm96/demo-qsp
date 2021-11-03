package windowHanling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMultipleWindowsOneByOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://naukri.com");
		Set<String> windowIds = driver.getWindowHandles();
		for(String winId:windowIds) {
			driver.switchTo().window(winId);
			driver.close();		
		}
	}
}
