package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTheTextFromWebPage {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("loginbutton")).submit();
		
		

	}

}
