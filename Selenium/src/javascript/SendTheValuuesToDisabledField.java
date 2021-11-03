package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTheValuuesToDisabledField {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement disbaledField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//pass the value to the disabled text field 
		js.executeScript("arguments[0].value='qspiders'", disbaledField);
		

	}

}
