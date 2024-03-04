package datecalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderhandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();

		// selectDate("23");

		selectFutureDate("June 2024", "11");
	}

	public static void selectFutureDate(String expMonthYear, String dateNum) {

//		if (Integer.parseInt(dateNum) > 31) {
//			System.out.println("wrong date passed....please pass the correct day/date..." + dateNum);
//			return;
//		}
//
//		if (expMonthYear.contains("February") && Integer.parseInt(dateNum) > 29) {
//			System.out.println("wrong date passed....please pass the correct day/date..." + dateNum);
//			return;
//		}

		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);

//		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
//			// click on next:
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		}
		
//		while (actMonthYear.equalsIgnoreCase(expMonthYear)) {
//			// click on next:
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//			
//			selectDate(dateNum);
//		}
		
		while(true) {
			if(actMonthYear.equalsIgnoreCase(expMonthYear)) {
			
				System.out.println("The Calender month is maching");
				selectDate(dateNum);
				break;
			}
			else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			}
			
		}
		
		
	}

	public static void selectDate(String dateNum) {
		driver.findElement(By.xpath("//a[text()='" + dateNum + "']")).click();

	}

}
