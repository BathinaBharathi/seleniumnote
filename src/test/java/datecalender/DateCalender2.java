package datecalender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateCalender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.manage().window().maximize();
		
		//Approch-1
		
				//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/31/1993");//mm/dd/yyyy
		
		//Approch-2
				String year="2027";
				String month="June";
				String date="3";
				driver.findElement(By.xpath("//input[@id='datepicker']")).click();//will open the date picker
				
				
				while(true)//select month & year
				{
					String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(mon.equals(month) && yr.equals(year))
					{
						break;
					}
					driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();// click on next for fecture date
					//driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();// click on previous for past date
				}

				//select date
				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				for(int i=0;i<alldates.size();i++)
				{
					if(alldates.get(i).getText().equals(date))
					{
						alldates.get(i).click();
						break;
					}
						
				}

	}

}
