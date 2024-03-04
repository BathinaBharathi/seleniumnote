package seleniumnote;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bank3i {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://10.30.73.56:5601/3ibank/index.html");

		driver.manage().window().maximize();

		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Bharathi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bh@12345");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1213");
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
		
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until
        (ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary agree-form'])[1]"))).click();
		
//		
		
		//Scroll down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
		//I agree checkbox
				driver.findElement(By.xpath("//input[@id='myCheck']")).click();
	//Agree@continue
				driver.findElement(By.xpath("//button[@id='accept_agree']")).click();
	//personal details form
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("test");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("demo");
	driver.findElement(By.xpath(" //input[@name='gender'][2]")).click();
	//date picker
	driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("07/31/1993");
	driver.findElement(By.xpath("//input[@id='pancard']")).sendKeys("1234567");
	driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys("8374027476");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testdemo123@gmail.com");
	driver.findElement(By.xpath("//button[@id='personal_details_save']")).click();
	driver.findElement(By.xpath("//button[@id='personal_details_submit']")).click();
	driver.findElement(By.xpath(" //h6[contains(text(),'Details Submitted Successfully')] ")).isDisplayed();
	System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Details Submitted Successfully')]")).getText());
	driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	driver.findElement(By.xpath("//h6[contains(text(),'Customer Form')]")).isDisplayed();
	System.out.println(driver.findElement(By.xpath("//h6[contains(text(),'Customer Form')]")).getText());
//Employment Details
driver.findElement(By.xpath("(//div[@id='nav-step2']/div/div/input)[1]")).sendKeys("demo");
driver.findElement(By.xpath("//p[text()='Employers Phone']//following-sibling::input[@type='text']")).sendKeys("test");
driver.findElement(By.xpath("//p[text()='Employement Status*']//following-sibling::input[@type='text']")).sendKeys("good");
//dropdown
WebElement ele=driver.findElement(By.xpath("//select[@id='quality-source']"));
Select select1 = new Select(ele);
select1.selectByVisibleText("Last Day Of The Month");	
driver.findElement(By.xpath("//input[@id='quality-reportpath']")).sendKeys("01/27/2024");
driver.findElement(By.xpath("//input[@id='quality-username']")).sendKeys("02/27/2024");
driver.findElement(By.xpath("(//input[@id='quality-password'])[1]")).sendKeys("100");
driver.findElement(By.xpath("(//input[@id='quality-password'])[2]")).sendKeys("100");
driver.findElement(By.xpath("//button[@id='employee_details_save']")).click();	
driver.findElement(By.xpath("//button[@id='employee_details_submit']")).click();	
driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).isDisplayed();
System.out.println(driver.findElement(By.xpath("//h5[ contains(text(),'You have been approved for $500')]")).getText());
driver.findElement(By.xpath("//button[contains(text(),'OK')] ")).click();
//logout
driver.findElement(By.xpath("//img[@id='profileimg']")).click();
driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();

	}
	
}
