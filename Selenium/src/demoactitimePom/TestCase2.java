package demoactitimePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws Throwable {
		String filePath="./resources/prop.properties";
		PropertyUtils propUtil = new PropertyUtils();
		String URL = propUtil.getPropertyData(filePath, "url");
		String userName = propUtil.getPropertyData(filePath, "username");
		String password = propUtil.getPropertyData(filePath, "password");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get(URL);
	    
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.login(userName, password);
	    driver.quit();

	}

}
