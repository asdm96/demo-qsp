package windowHanling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowBasedOnTitle {

	public static void main(String[] args) {
		String expectedTitle="Cognizant";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://naukri.com");
		 Set<String> windowIds = driver.getWindowHandles();
		for(String winid:windowIds) {
			driver.switchTo().window(winid);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle)) {
				driver.close();
				break;
			}
		}
	}

}
