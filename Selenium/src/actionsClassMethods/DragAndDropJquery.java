package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropJquery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		//identify frame and pass the driver controller to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        //identify webelement
        WebElement box = driver.findElement(By.id("draggable"));
        //perform the action
        Actions action = new Actions(driver);
        action.dragAndDropBy(box, 200, 50).perform();
        //pass the driver controller to parent frame
        driver.switchTo().defaultContent();
        String text = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        System.out.println(text);
	}

}
