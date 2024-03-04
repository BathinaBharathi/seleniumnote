package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneymart.ca/home");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In / Sign Up')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Sign Up now']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("josefa");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("portaro");
		driver.findElement(By.xpath("//input[@placeholder='YYYY/MM/DD' and @calendar='true']")).sendKeys("1986/08/22");
		driver.findElement(By.xpath("//input[@placeholder='XXX-XXX-XXXX' or @name='phoneNumber']")).sendKeys("876-124-8763");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("josefatest@yopmail.com");
		driver.findElement(By.xpath("//button[@class='mm-select__value']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'What was your childhood nickname?')])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Security Question']//following::input[1]")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@value='Create Account']")).click();
		

	}

}
