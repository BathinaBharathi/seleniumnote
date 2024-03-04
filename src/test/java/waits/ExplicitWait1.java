package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
        //Thread.sleep(12000);
		
		//Using Explicit wait
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SwitchTo']")));
        
        Actions action= new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
       // driver.findElement(By.xpath("//a[text()='Alerts']")).click();
        action.click(driver.findElement(By.xpath("//a[text()='Alerts']"))).perform();
        
//        WebElement moveele= 
//        action.moveToElement((driver.findElements(By.xpath("//a[contains(text(),'Widgets')]")))).build().perform();
//        action.click(driver.findElement(By.xpath(" //a[contains(text(),'AutoComplete')] "))).perform();
	}

}
