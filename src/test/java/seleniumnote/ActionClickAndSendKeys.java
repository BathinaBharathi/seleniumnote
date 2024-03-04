package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
        Thread.sleep(3000);
        
        By email = By.id("input-email"); 
		By password = By.id("input-password");
		By loginBtn = By.xpath("//button[normalize-space()='Login']");
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(email), "tom@gmail.com").perform();
		act.sendKeys(driver.findElement(password), "tom123").perform();

		act.click(driver.findElement(loginBtn)).perform();
		
		//ElementNotIntereactableException
		
	
	}

}
