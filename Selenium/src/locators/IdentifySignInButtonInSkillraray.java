package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifySignInButtonInSkillraray {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("SIGN IN")).click();
		driver.quit();

	}

}
