package windowHanling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWondows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://naukri.com");
		String parentWindowID = driver.getWindowHandle();
		Set<String> allwindowIds = driver.getWindowHandles();
		allwindowIds.remove(parentWindowID);
		for(String winId:allwindowIds) {
			driver.switchTo().window(winId);
			driver.close();
		}

	}

}
