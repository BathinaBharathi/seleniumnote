package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement Sourcele= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetEle= driver.findElement(By.xpath("//div[@id='droppable']"));
        
        Actions act= new Actions(driver);
        act.dragAndDrop(Sourcele, targetEle).build().perform();
        
	}

}
