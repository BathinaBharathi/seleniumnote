package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//josefatest@yopmail.com---user name
		//Test@123---password
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneymart.ca/home");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In / Sign Up')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("josefatest@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[@class='login_button_wrap']//button[1]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[starts-with(text(),'Need more cash? ')]//following::button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[starts-with(text(),'Confirm your Province ')]//following::button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Ontario')]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)", "");
		
		WebElement ele2= driver.findElement(By.xpath("//input[@name='address']"));
//		
//		// Scrolling down the page till the element is found		
//        js2.executeScript("arguments[0].scrollIntoView();", ele2);
		ele2.click();
		Thread.sleep(3000);
		
		WebElement webelement = driver.findElement(By.xpath("//input[@name='address']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='L11-309 Hilldale Rd, THUNDER BAY ON P7G 0A2, CANADA';",webelement );
	    //driver.findElement(By.xpath("//input[@name='address']")).sendKeys("L11-309 Hilldale Rd,THUNDER BAY ON P7G 0A2,CANADA");
		
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("(//div[@title=\"608 Churchill Ave\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='mm-btn-click']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sin' or @type='password']")).sendKeys("649-456-274");
		driver.findElement(By.xpath("(//label[@class='mm-checkbox'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='gs-accept']")).click();
	}

}
