package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleepmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//open url
		WebDriver driver =new ChromeDriver();
				driver.get("https://prana.3i-infotech.com/digite/Request?Key=login");
				 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit command
				
				driver.manage().window().maximize(); //maximize the window
				
				driver.findElement(By.xpath("//input[@id='loginId']")).sendKeys("1002646");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ITServiceTecH@12");
				driver.findElement(By.xpath("//input[@id='login-btn']")).click();
				
				driver.quit();
	}

}
