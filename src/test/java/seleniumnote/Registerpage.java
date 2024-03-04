package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Registerpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//johntest@yopmail.com
		//test@123
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialsninja.com/demo/");

		driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("john");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("johntest112@yopmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8935476124");
      //Scroll down
		
      		JavascriptExecutor js = (JavascriptExecutor) driver;
      		js.executeScript("window.scrollBy(0,350)", "");
        
      		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
      		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("test@123");
      		driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]//following::input[1]")).click();
      		driver.findElement(By.xpath("//input[@name='agree']")).click();
      		driver.findElement(By.xpath("//input[@value='Continue']")).click();
      		driver.findElement(By.xpath("//h1[starts-with(text(),'Your Account')]")).isDisplayed();
      		driver.findElement(By.xpath("//a[text()='Continue']")).click();
      	//Scroll down
    		
    		JavascriptExecutor js1 = (JavascriptExecutor) driver;
    		js1.executeScript("window.scrollBy(0,350)", "");
      		
      		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
      		
	}

}
