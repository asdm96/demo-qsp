package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Dimension dimesion=driver.manage().window().getSize();
		int height = dimesion.getHeight();
		int width = dimesion.getWidth();
		System.out.println(height);
		System.out.println(width);
        driver.quit();
	}

}
