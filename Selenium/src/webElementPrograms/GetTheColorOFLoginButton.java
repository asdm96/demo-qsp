package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheColorOFLoginButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String colorOfLoginButton = driver.findElement(By.xpath("//div[text()='Login ']"))
				                    .getCssValue("border-top-color");
		System.out.println(colorOfLoginButton);
	
		
		
		driver.quit();
		

	}

}
