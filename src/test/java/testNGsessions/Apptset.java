package testNGsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apptset {
	public WebDriver driver;
	
	@BeforeSuite
	public void connectDB() {
    System.out.println("connect DB method");
}
 @BeforeTest
	public void createuser() {
		System.out.println("createuser method");
	}
 @BeforeClass
	public void launchBrowser() {
		System.out.println("launchBrowser method");
		 driver = new ChromeDriver();
	}
 @BeforeMethod
 public void login() {
		System.out.println("login method");
		driver.get("http://10.30.73.56:5601/3ibank/index.html");
		
	}
 @Test
	public void aTest() {
		System.out.println("bTest method");
		System.out.println(driver.getTitle());
		
	}
 @Test
	public void aTest1() {
		System.out.println("aTest method");
		System.out.println(driver.getCurrentUrl());
		
	}
 
 @AfterMethod
	public void logout() {
		System.out.println(" logout method");
	}
 @AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser method");
		driver.quit();
	}
	@AfterTest
	public void deleteuser() {
		System.out.println(" deleteuser method");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnectDB method");
	}
}