package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//multiple data in parallel
public class Testcase9 {
	@DataProvider(name="credentilas",parallel=true)
	public String [][] getData() {
	  String [][] arr= {{"admin","manager"},{"trainee","trainee"}};
	  return arr;
	}
	@Test(dataProvider = "credentilas")
	public void loginDemo(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
}

}
