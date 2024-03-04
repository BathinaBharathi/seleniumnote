package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize(); //maximize the window
		
		//css with tag & id
		
		      //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		       //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		//CSS with tag & class
		
		     //driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("MacBook");
		     //driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("MacBook");
		
		//tag & attribute
		
				//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
				driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");
				
		//tag class & attribute
				driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
				


	}

}
