package windowHanling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheWindowIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		Set<String> windowIds = driver.getWindowHandles();
		for(String ids:windowIds) {
			System.out.println(ids);
		}
		driver.close();
	}
}
