package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeTransfer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qbank.accelq.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='qb-username']")).sendKeys("qbankadmin");
		driver.findElement(By.xpath("//input[@id='qb-password']")).sendKeys("qbTrnPass1&");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(12000);
		driver.findElement(By.xpath("//div[contains(text(),'Welcome back!')]")).isDisplayed();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Make a Transfer')]")).click();
		Thread.sleep(5000);
	     WebElement ele =driver.findElement(By.id("qbf-accountname-input"));
		
		Select select =new Select(ele);
		select.selectByValue("Monthly Savings account");
		 
		
		WebElement ele2 =driver.findElement(By.id("qbf-toaccount-input"));
			
			Select selec2t =new Select(ele2);
			selec2t.selectByValue("Electricity Bill");
			
	driver.findElement(By.xpath("//input[@id='qbf-amount-input']")).sendKeys("100");
	driver.findElement(By.xpath("//input[@id='qbf-memo-input']")).sendKeys("Testing");
	//Scroll down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,150)", "");
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();	
	Thread.sleep(7000);
	// Scroll up
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-350)", "");
	
	//driver.findElement(By.xpath("//button[@id='sub-qb']")).click();	
	driver.findElement(By.xpath("//button[contains(text(),'Go to Account Summary')]")).click();	
	
	
		
		
		
	}

}
