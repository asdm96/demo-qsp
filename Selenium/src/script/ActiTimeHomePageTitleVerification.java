package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeHomePageTitleVerification {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle="actiTIME - EnteTime-Track";
		String userName="admin";
		String password="manager";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle is " + expectedTitle);
		System.out.println("actual title is "+actualTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("title is verified, testcase is passed");
		}else {
			System.out.println("title is verified, testcase is failed");
		}
		driver.close();
		driver.findElement(By.linkText("Logout")).click();
		//driver.quit();


	}

}
