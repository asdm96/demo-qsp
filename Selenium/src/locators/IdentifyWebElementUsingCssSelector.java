package locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyWebElementUsingCssSelector {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("inputername")).sendKeys("adarsh");
		

	}                                                                                                                                                                                          

}
