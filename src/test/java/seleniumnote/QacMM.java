package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QacMM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://qac.moneymart.ca/home");

		driver.manage().window().maximize();
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In / Sign Up')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("josefademo@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo@123");
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//div[@class='login_button_wrap']//button[1]")).click();
		
		//Scroll down
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,350)", "");
		
				Thread.sleep(12000);
		driver.findElement(By.xpath("//div[starts-with(text(),'Need more cash? ')]//following::button[1]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Installment Loan')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[starts-with(text(),'Confirm your Province ')]//following::button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Ontario')]")).click();
		Thread.sleep(3000);
		//Scroll down
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("window.scrollBy(0,200)", "");

	}

}
