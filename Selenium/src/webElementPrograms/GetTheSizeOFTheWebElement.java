package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author QSP
 *
 */
public class GetTheSizeOFTheWebElement {
    /**
     * it will give you the size of the window
     * @param args
     * @param a
     */
	public static void main(String[] args,int a) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		Dimension dimensions = driver.findElement(By.id("username")).getSize();

		int heightOfUsernameTextField = dimensions.getHeight();
		int widthOfUsernameTextField= dimensions.getWidth();

		System.out.println(heightOfUsernameTextField);
		System.out.println(widthOfUsernameTextField);

		driver.quit();
	}

}
