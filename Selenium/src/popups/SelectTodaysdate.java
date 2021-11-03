package popups;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTodaysdate {

	public static void main(String[] args) {
		LocalDateTime dateAndTime = LocalDateTime.now();
		int date = dateAndTime.getDayOfMonth();
		System.out.println(date);
		String month = dateAndTime.getMonth().name();
		System.out.println(month);
		String editedMonth = month.substring(0,1).toUpperCase()+month.substring(1,3).toLowerCase();
		int year = dateAndTime.getYear();
		String day = dateAndTime.getDayOfWeek().name();
		System.out.println(day);
		String editedDay = day.substring(0,1).toUpperCase()+day.substring(1,3).toLowerCase();
		
		String Todaysdate=editedDay+" "+editedMonth+" "+date+" "+ year;
		System.out.println(Todaysdate);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
        //click on departure element
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		//select The date from calendar
		//div[text()='October 2021']/ancestor::div[@class='DayPicker-Month']//p[text()='22']
		driver.findElement(By.xpath("//div[@aria-label='"+Todaysdate+"']")).click();

			
	}

}
