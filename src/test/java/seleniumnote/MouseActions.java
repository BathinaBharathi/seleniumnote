package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
        Thread.sleep(12000);
        
        Actions action= new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
       // driver.findElement(By.xpath("//a[text()='Alerts']")).click();
        action.click(driver.findElement(By.xpath("//a[text()='Alerts']"))).perform();
        
//        WebElement moveele= 
//        action.moveToElement((driver.findElements(By.xpath("//a[contains(text(),'Widgets')]")))).build().perform();
//        action.click(driver.findElement(By.xpath(" //a[contains(text(),'AutoComplete')] "))).perform();
	}

}
