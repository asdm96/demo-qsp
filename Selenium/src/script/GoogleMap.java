package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {

	public static void main(String[] args) {
		GoogleMap.gMaps("Bengaluru", "Mysore");
		
	}
	public static void gMaps(String source,String destination){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/dir///@16.1725459,75.6557093,15z");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[contains(@class,'tactile-searchbox-input')])[4]")).sendKeys(source);
		driver.findElement(By.xpath("(//input[contains(@class,'tactile-searchbox-input�)])[5]")).sendKeys(destination);
		driver.findElement(By.xpath("(//input[contains(@class,'tactile-searchbox-input�)])[5]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//button[contains(@aria-label,'Search')])[3]")).click();
		
		List<WebElement> allDistances = driver.findElements(By.xpath("//div[contains(@class,'xB1mrd-T3iPGc-trip-ij8cu')]"));
		System.out.println(allDistances.size());
		for (WebElement webElement : allDistances) {

			String name = webElement.getText();

			System.out.println(name);
		}
	}

}
