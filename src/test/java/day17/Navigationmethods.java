package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.myntra.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.shopsy.in/");
		System.out.println(driver.getCurrentUrl());
	
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // amzon
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // flipkart
		
		driver.navigate().refresh();  // refresh the page
	}

}
