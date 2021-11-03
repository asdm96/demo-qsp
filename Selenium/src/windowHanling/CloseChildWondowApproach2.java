package windowHanling;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWondowApproach2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://naukri.com");
		String parentWindowID = driver.getWindowHandle();
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String winId:allwindowIds) {
			driver.switchTo().window(winId);
			if(!winId.equals(parentWindowID)) {
				driver.close();
			}
		}
		
		}
	}

