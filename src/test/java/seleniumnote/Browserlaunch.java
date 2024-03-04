package seleniumnote;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		driver.findElement(By.partialLinkText("Grande-Prairie, Canada")).click();
		
        Thread.sleep(9000);
        String title= driver.findElement(By.xpath("//div[@class='card-location  card-header-h1']//h1[@class='card-location-name']")).getText();
		System.out.println(title);
        
        List<WebElement> ele= driver.findElements(By.tagName("a"));
		
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++) {
			System.out.println(ele.get(i).getText());
			
			//String title=ele.get(i).getText();
			if (title.equalsIgnoreCase("Fort St John, Canada")) {
				ele.get(i).click();
			}
			
		}
		driver.quit();

		
		
		


	}

}
