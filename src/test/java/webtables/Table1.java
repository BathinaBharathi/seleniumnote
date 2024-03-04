package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.manage().window().maximize();
		 //Scroll down
		
  		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,500)", "");
  		
  		List<WebElement> ele= driver.findElements(By.xpath("//table[@id='tablepress-1']//tbody//tr//td[2]"));
  		System.out.println(ele.size());
  		
  		for(int i =0;i<ele.size(); i++) {
  			System.out.println(ele.get(i).getText());
  		}
	}

}
