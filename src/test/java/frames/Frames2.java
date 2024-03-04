package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("demotesting");
        driver.findElement(By.name("lname")).sendKeys("leosmith");
        
        driver.switchTo().defaultContent();// come back to frame
        
       driver.switchTo().frame("firstFr");
        WebElement childframe= driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
        driver.switchTo().frame(childframe);
        driver.findElement(By.name("email")).sendKeys("leosmith@yopmail.com");
        
	}

}
