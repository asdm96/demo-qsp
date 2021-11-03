package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		String expetedToolTipTitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String actualToolTiptitle = driver.findElement(By.name("remember")).getAttribute("title");
	    System.out.println(actualToolTiptitle);
	    if(expetedToolTipTitle.equals(actualToolTiptitle)) {
	    	System.out.println("Passed: Tool tip is verified");
	    }else {
	    	System.out.println("failed: values are diferent");
	    }
		
       driver.quit();
	}

}
