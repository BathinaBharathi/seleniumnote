package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize(); //maximize the window
		
		//using relative x-path
		String productname=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
		System.out.println(productname);
	}

}
