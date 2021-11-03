package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropInGlobalSqa {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		//identifying frame and passing driver controller to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		//identification of source and destination 
		WebElement source = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
        WebElement destination = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
        
        //performing actions
        Actions action = new Actions(driver);
        action.dragAndDrop(source, destination).perform();
        
        driver.quit();

	}

}
