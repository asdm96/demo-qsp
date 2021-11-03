package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsSelectedAndIsDisplayedVerification {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.name("remember"));
		checkBox.click();
		Thread.sleep(4000);
		boolean flag = checkBox.isDisplayed();
		boolean flag2 = checkBox.isSelected();
		if(flag && flag2) {
			System.out.println("element is displayed and checked, testcase is passed");
		}else {
			System.out.println("element is not displayed");
		}
		driver.quit();
		

	}

}
