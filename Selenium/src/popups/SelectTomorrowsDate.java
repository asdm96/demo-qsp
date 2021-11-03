package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTomorrowsDate {

	public static void main(String[] args) {

		LocalDateTime dateAndTime = LocalDateTime.now().plusDays(1);
		int date = dateAndTime.getDayOfMonth();
		String month = dateAndTime.getMonth().name();
		String editedMonth = month.substring(0,1).toUpperCase()+month.substring(1,3).toLowerCase();
		int year = dateAndTime.getYear();
		String day = dateAndTime.getDayOfWeek().name();
		String editedDay = day.substring(0,1).toUpperCase()+day.substring(1,3).toLowerCase();
		
		String Tomorrowsdate=editedDay+" "+editedMonth+" "+date+" "+ year;
		System.out.println(Tomorrowsdate);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
        //click on departure element
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		//select The date from calendar
		driver.findElement(By.xpath("//div[@aria-label='"+Tomorrowsdate+"']")).click();

	}

}
