package demoactitimePom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws Throwable {
		String filePath="./resources/prop.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties properties = new Properties();
		properties.load(file);
		String URL = properties.getProperty("url");
		String userName=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    driver.get(URL);
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.login(userName, password);
	    driver.quit();

	}

}
