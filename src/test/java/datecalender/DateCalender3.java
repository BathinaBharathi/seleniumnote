package datecalender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateCalender3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.manage().window().maximize();
		   
	      //Scroll down
			
	  		JavascriptExecutor js = (JavascriptExecutor) driver;
	  		js.executeScript("window.scrollBy(0,100)", "");
	  		
	  		
	  		

			//Approch-1
			
			//driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_departureDate']")).sendKeys("7/31");//mm/dd
	  		
			//WebElement date=driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_departureDate']"));
			//date.clear();
			//date.sendKeys("7/31");  //m/dd
	  		
	  	//Approch-2
	  		
	  		String year="2017";
			String month="June";
			String date="3";
			driver.findElement(By.xpath("//input[@id='datepicker2']")).click();//will open the date picker
			
			

	}

}
