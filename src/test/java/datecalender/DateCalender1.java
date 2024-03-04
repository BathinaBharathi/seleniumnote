package datecalender;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateCalender1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); //switch to the frame
		
		//Approch-1
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/31/1993");//mm/dd/yyyy
		
		//Approch-2
		String year="2017";
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
			//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();// click on next for fecture date
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();// click on previous for past date
		}
		
       //select date
		/*List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:alldates)
		{
		if(dt.getText().equals(date))	
		{
			dt.click();
			break;
		}
		}*/
		//List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		}
		

	}


