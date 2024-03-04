package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad*/


public class logintesthrm {

	public static void main(String[] args) throws Exception {
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//provide user name-Admin
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//provide password-password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click on login button
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //close the browser
	    //driver.quit();
	    driver.close();
	    
		
		
		
		// TODO Auto-generated method stub

	}

}
