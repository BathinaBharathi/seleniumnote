package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
				WebDriver driver =new ChromeDriver();
				//open url
				driver.get("https://tutorialsninja.com/demo/");
				Thread.sleep(5000);
				driver.manage().window().maximize(); //maximize the window
				
				//search the product
				driver.findElement(By.name("search")).sendKeys("iphone");
				
				//click the search button
				driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
				

	}

}
