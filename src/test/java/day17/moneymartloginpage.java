package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class moneymartloginpage {

	public static void main(String[] args) throws Exception {
		//Launch the browser
				WebDriver driver =new ChromeDriver();
				//open url
				driver.get("https://www.moneymart.ca/home");
				Thread.sleep(5000);
				
				//click on signin/signup button
				driver.findElement(By.className("text underline")).click();
				
				//provide Email-leosoap@yopmail.com
				driver.findElement(By.name("email")).sendKeys("leosoap@yopmail.com");
				
				//provide password-soap@123
				driver.findElement(By.name("password")).sendKeys("soap@123");
				
				//click on sign in button
			    driver.findElement(By.xpath("//button[@class='mm-btn mm-btn--lg mm-btn--block mb-2']")).click();
			    
			    //close the browser
			    //driver.quit();
			    driver.close();
		// TODO Auto-generated method stub

	}

}
