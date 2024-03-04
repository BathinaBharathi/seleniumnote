package day17;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize(); //maximize the window
		
		System.out.println("Tittle of the page:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		//System.out.println("Page Source:"+driver.getPageSource());
		System.out.println("Page source-------------");
		String ps=driver.getPageSource();
		System.out.println(ps.contains("html"));
		System.out.println("window handle id:"+driver.getWindowHandle());
       
		
		Set<String> windowids=driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			System.out.println(winid);
		
		

	    }

}}
