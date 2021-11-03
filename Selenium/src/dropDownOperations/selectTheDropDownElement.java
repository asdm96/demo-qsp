package dropDownOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectTheDropDownElement {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropDown = driver.findElement(By.name("cars"));
		
		Select select = new Select(dropDown);
		
		select.selectByIndex(0);
		select.selectByIndex(1);

		
		WebElement firstElement = select.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		
		List<WebElement> allElement = select.getAllSelectedOptions();
		for(WebElement element:allElement) {
			System.out.println(element.getText());
		}
		select.deselectAll();
	

	}

}
