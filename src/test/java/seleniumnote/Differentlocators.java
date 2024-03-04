package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differentlocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qbank.accelq.com/");
		driver.manage().window().maximize();
		
		/*htmltag[@attr1 = 'value' and @attr2 = 'value']
		driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("admin");
		
		//htmltag[contains(@attr,'value')]
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		
		//contains() with multiple attributes:
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		
		driver.findElement(By.xpath("//input[contains(@type,'submit') and contains(@value,'Log In')]")).click();*/
		Thread.sleep(7000);
		//htmltag[@attr1 = 'value' and @attr2 = 'value']
		driver.findElement(By.xpath("//input[@id='qb-username' and @ng-model='username']")).sendKeys("qbankadmin");
		
		//contains():---->//htmltag[contains(@attr,'value')]
		driver.findElement(By.xpath("//input[contains(@id,'qb-password')]")).sendKeys("qbTrnPass1&");
		
	 //contains() with multiple attributes:
	//htmltag[contains(@attr1,'value') and contains(@attr2='value')]
	driver.findElement(By.xpath("//button[contains(@class,'qb-signin-button') and contains(@type,'submit')]")).click();
	
	Thread.sleep(7000);
	//text():----//htmltag[text()='value']
	driver.findElement(By.xpath("//div[text()='Bill Payments']")).click();
	Thread.sleep(3000);
	
	/*driver.findElement(By.xpath("//input[@class='qbf-input medium ng-pristine ng-valid ng-empty ng-touched']")).sendKeys("john");
	driver.findElement(By.xpath("//div[contains(text(),'Select Bill')]")).click();
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1000");
	
	//one attr with contains and one without contains
		//input[contains(@id,'email') and @type='text']	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(@id,'sub-qb') and @type='submit']")).click();*/
	
	driver.findElement(By.xpath(
			"//div[contains(text(),'Transfer from')]//following::input[@ng-model=\"userCtrl.forms.billPayment.account\"]"))
			.sendKeys("testing sai");
	
	driver.findElement(By.xpath("//div[contains(text(),'Select Bill')]//following::a[1]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Mobile bill')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Select Bill')]//following::input[1]")).sendKeys("200");
	
	driver.findElement(By.xpath("//button[@class='qbf-submit-button']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Go to Account Summary')]")).click();

	
		
	}

}
