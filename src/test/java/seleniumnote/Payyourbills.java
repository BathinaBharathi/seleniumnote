package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payyourbills {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qbank.accelq.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='qb-username']")).sendKeys("qbankadmin");
		driver.findElement(By.xpath("//input[@id='qb-password']")).sendKeys("qbTrnPass1&");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(25000);

		driver.findElement(By.xpath("//div[contains(text(),'Welcome back!')]")).isDisplayed();
		
		driver.findElement(By.xpath("//div[contains(text(),'Pay your Bills')]")).click();
		Thread.sleep(5000);
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
