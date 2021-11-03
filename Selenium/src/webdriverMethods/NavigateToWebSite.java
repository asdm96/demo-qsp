package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToWebSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String expectedTitle="Selenium"; //testdata
		//navigate to selenium website
		driver.get("http//www.selenium.dev/");
		//capture the title and store
		String actualTitle=driver.getTitle();
		//print the title
		System.out.println(actualTitle);
		//verification and validation
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("testcase is passed");
		}else {
			System.out.println("testcase is failed");
		}
		//close the window and server
		driver.quit();
	}

}
