package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		//declaring explicit wait
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://prana.3i-infotech.com/digite/Request?Key=login");
		
		WebElement useranme=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginId']")));
		useranme.sendKeys("1002646");
		
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-btn']")));
		password.sendKeys("ITServiceTecH@12");
		 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit command
		
		//driver.manage().window().maximize(); //maximize the window
		
		
		
	}

}
