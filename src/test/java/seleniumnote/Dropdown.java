package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qbank.accelq.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("qb-username")).sendKeys("qbankadmin");
		driver.findElement(By.id("qb-password")).sendKeys("qbTrnPass1&");
		Thread.sleep(3000);
		driver.findElement(By.className("qb-signin-button")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//div[@id='make-a-trans-btn']")).click();
		Thread.sleep(5000);
		
		WebElement ele1=driver.findElement(By.xpath("//select[@id='qbf-accountname-input']"));
		Select select1 = new Select(ele1);
		
		//select1.selectByValue("Salary Account");
		select1.selectByVisibleText("Monthly Savings account");
		
		
		WebElement ele= driver.findElement(By.xpath("//select[@id='qbf-toaccount-input']"));
		
		Select select = new Select(ele);
		
		select.selectByValue("Electricity Bill");
		
		select.selectByVisibleText("Mortgage Payment");
		
		select.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='qbf-amount-input']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='qbf-memo-input']")).sendKeys("Testing");
		//driver.findElement(By.xpath("//div[contains(text(),'Select Bill')]//following::input[1]")).sendKeys("100");
        driver.findElement(By.xpath("//button[@class='qbf-submit-button']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Go to Account Summary')]")).click();
	}

}
