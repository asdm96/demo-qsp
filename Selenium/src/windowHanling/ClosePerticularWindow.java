package windowHanling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosePerticularWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://naukri.com");
		Set<String> allwindowIds = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(allwindowIds);
		String secondWindowId = list.get(2);
		driver.switchTo().window(secondWindowId);
		driver.close();

	}

}
